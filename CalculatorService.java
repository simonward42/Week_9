/**
 * An interface for the Calculator service
 */
public interface CalculatorService {
	/**
	 * Returns the result of adding the given parameters
	 * @param x, y the doubles to be added
	 * @return the result of addition
	 */
	double add(double x, double y);
	/**
	 * Returns the result of subtracting the second parameter from the first
	 * @param x the number to be subtracted from 
	 * @param y the number to subtract 
	 * @return the result of subtraction
	 */
	double subtract(double x, double y);
	/**
	 * Returns the result of multiplying the two numbers given
	 * @param x, y the numbers to multiply
	 * @return the result of multiplication
	 */
	double multiply(double x, double y);
	/**
	 * Returns the result of dividing the first parameter by the second
	 * @param x the numerator
	 * @param y the denominator
	 * @return the result of division
	 */
	double divide(double x, double y);
}