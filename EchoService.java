/**
 * Created with IntelliJ IDEA.
 * User: simon
 * Date: 05/12/2012
 * Time: 14:59
 * To change this template use File | Settings | File Templates.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * An interface for the echo service.
 */
public interface EchoService extends Remote {
    /**
     * Returns the same string passed as parameter
     * @param s a string
     * @return the same string passed as parameter
     */
    public String echo(String s) throws RemoteException;
}
