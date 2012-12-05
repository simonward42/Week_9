/**
 * Created with IntelliJ IDEA.
 * User: simon
 * Date: 05/12/2012
 * Time: 16:31
 * To change this template use File | Settings | File Templates.
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Date;
public class DateServer extends UnicastRemoteObject implements DateService {
    public DateServer() throws RemoteException {
        // nothing to initialise for this server
    }
    @Override
    public String date() {
        // This println is not necessary, but helps verifying whether
        // the server has received the call or not on the remote machine
        Calendar rightNow = Calendar.getInstance();
        String dateStr = "" + rightNow.get(rightNow.DAY_OF_WEEK) + " ";
        dateStr += rightNow.get(rightNow.DAY_OF_MONTH) + "/";
        dateStr +=  rightNow.get(rightNow.MONTH) + "/";
        dateStr += rightNow.get(rightNow.YEAR) + " ";
        dateStr += rightNow.get(rightNow.HOUR) + ":";
        dateStr += rightNow.get(rightNow.MINUTE) + ":";
        dateStr += rightNow.get(rightNow.SECOND) + " " + rightNow.get(rightNow.AM_PM);
        System.out.println("Replied to some client with date and time '" + dateStr + "'");
        return dateStr;
    }
}

