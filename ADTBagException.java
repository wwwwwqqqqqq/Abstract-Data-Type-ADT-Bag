package ADT;
import java.lang.Exception;
import java.lang.RuntimeException;

/**
 * Define an exception to be thrown when the list is full. 
 * @author Qin Weiwei
 * @version 3.0
 */

//Runtime exceptions occur when the error is not considered as serious.
//These types of exceptions can often be prevented by fail-safe programming. 
//For example, it is fairly easy to avoid allowing an array index to go out of range, a situation that causes the runtime exception ArrayIndexOutOfBoundsException to be thrown. 
//Runtime exceptions are instances of classes that are subclasses of the java.lang.RuntimeException class. 
//RuntimeException is a subclass of java.lang.Exception that relaxes the requirement forcing the exception to be either handled or explicitly thrown by the method.
public class ADTBagException extends RuntimeException {
	/**
	 * Construct a function with a string specific message.
	 * @param message A String specific message of the Exception.
	 */
	public ADTBagException(String message)
	{
		super(message);
	}
}
