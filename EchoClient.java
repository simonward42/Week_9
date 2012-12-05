import java.net.MalformedURLException;
import java.rmi.*;

/**
 * Created with IntelliJ IDEA.
 * User: simon
 * Date: 05/12/2012
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public class EchoClient {
    public static void main(String[] args) {
        EchoClient client = new EchoClient();
        client.launch();
    }
    public void launch() {
        // 1. Set up security manager (using the same code as the server)
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        // 2. Find a reference to the remote server object, by asking the registry
        try {
            Remote service = Naming.lookup("//127.0.0.1:1099/echo");
            EchoService echoService = (EchoService) service;
            // Once this is done, using the service is as easy as a normal method call:
            String receivedEcho = echoService.echo("Hello!");
            System.out.println("Received echo from server: '" + receivedEcho + "'");
        } catch (MalformedURLException ex) { // if name is wrong
            ex.printStackTrace();
        } catch (NotBoundException ex) { // if server not registered with the right name
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
