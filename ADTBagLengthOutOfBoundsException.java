package ADT;
import java.lang.Exception;
import java.lang.IndexOutOfBoundsException;

/**
 * Define an exception which is thrown when an index is out of bound.
 * @author Qin Weiwei
 * @version 3.0
 */
public class ADTBagLengthOutOfBoundsException extends IndexOutOfBoundsException{
	/**
	 * Construct a function with a string specific message.
	 * @param message A String specific message of the Exception.
	 */
	public ADTBagLengthOutOfBoundsException(String message){
		super(message);
	}
}
