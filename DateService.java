import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: simon
 * Date: 05/12/2012
 * Time: 16:28
 * To change this template use File | Settings | File Templates.
 */
/**
 * An interface for the Date service.
 */
public interface DateService extends Remote {
        /**
         * Returns the current date and time
         * @return the date and time as a formatted String
         */
        public String date() throws RemoteException;
}
