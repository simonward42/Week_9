import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created with IntelliJ IDEA.
 * User: simon
 * Date: 05/12/2012
 * Time: 15:15
 * To change this template use File | Settings | File Templates.
 */
public class EchoServerLauncher {
    public static void main(String[] args) {
        EchoServerLauncher launcher = new EchoServerLauncher();
        launcher.launch();
    }
    public void launch() {
        // 1. If there is no security manager, start one
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            // 2. Create the registry if there is not one
            LocateRegistry.createRegistry(1099);
            // 3. Create the server object
            EchoServer server = new EchoServer();
            // 4. Register (bind) the server object on the registry.
            //    (The registry may be on a different machine)
            String registryHost = "//localhost/";
            String serviceName = "echo";
            Naming.rebind(registryHost + serviceName, server);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
