import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class CalculatorServer extends Remote implements CalculatorService {
	
	public CalculatorServer() throws RemoteException {
		// Nothing to be initialised...
	}
	@Override
	public double add(double x, double y) {
		double result = x + y;
		System.out.println("Calculated " + x + " + " + y + " = " + result);
		return result;
	}
	@Override
	public double subtract(double x, double y) {
		double result = x - y;
		System.out.println("Calculated " + x + " - " + y + " = " + result);
		return result;
	}
	@Override
	public double multiply(double x, double y) {
		double result = x * y;
		System.out.println("Calculated " + x + " * " + y + " = " + result);
		return result;
	}
	@Override
	public Double divide(double x, double y) { // If y = 0, 
		double result = x + y;
		System.out.println("Calculated " + x + " + " + y + " = " + result);
		return result;
	}
}