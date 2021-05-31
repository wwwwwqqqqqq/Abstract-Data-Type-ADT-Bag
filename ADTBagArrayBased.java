package ADT;
import java.util.Random;

/**
 * Implementation for operations a linked list.
 * @author Qin Weiwei
 * @version 3.0
 */
public class ADTBagArrayBased implements ADTBagInterface{
	    /**
	     * Define the array of Object type.
	     */
		private Object[] list;
		
		/**
		 * Define the number of items of the list in int.
		 */
		private int length;
		
		/**
		 * Define a maximum number of length for the list in int.
		 */
		private int Maxlength = 50;
		
		/**
		 * Construct a bag of items.
		 */
		public ADTBagArrayBased(){
		this.list = new Object[Maxlength];
		this.length = 0;
	}
/**
 * Insert an item in the bag in list[0](insert(item)).
 * @param nextLine
 * @throws ADTBagException If length > size().
 */
public void insert(Object item) {
	if(this.length > this.Maxlength)
	{
		throw new ADTBagException("This list is full!");
	}
	this.list[this.length] = item;
	this.length ++;
}

/**
 * Construct a method to remove the last item put in the bag ( removeLast()).
 */
public void removeLast() {
	this.list[length - 1] = null;
	this.length --;
}

/**
 * Construct a method to remove a random item from the bag (removeRandom()).
 */
public void removeRandom() {
	Random a = new Random();
	int b = a.nextInt(this.length);
	this.list[b] = null;
	for(int i = b;i < this.length;i ++) {
		this.list[i] = this.list[i + 1];
	}
	this.length --;
}

/**
 * Return a boolean value to this get element.
 * @param item An object specifying the identical item.
 * @return An object specifying the retrieved item.
 */
public Object get(Object item) {
	for(int i = 0;i < this.length;i ++) {
		if(this.list[i].equals(item)) {
			return this.list[i];
		}
	}
	return false;
}

/**
 * Return an item at index from the bag.
 * @param index An integer specifying the position of the bag.
 * @return An object specifying the retrieved item.
 * @throws ADTBagLengthOutOfBoundsException If index < 0 or index > size().
 */
//If the index value is out of range, an exception should be thrown. 
//Therefore, a subclass of IndexOutOfBoundException needs to be defined.
public Object get(int index) {
	if(index >= 0 && index < this.length)
	{
	if(!(this.list[index] == null))
	{
		return this.list[index];
	}
    return ("This " + index + " of bag have a mistake");
	}
	else
		throw new ADTBagLengthOutOfBoundsException("This index is Exceeded the capacity of the packet!");
}

/**
 * Check how many items are in the bag.
 * Return the length of the list in integer.
 * @return An integer length of the bag.
 */
public int size() {
	return this.length;
}

/**
 * Check to see if the bag is full (isFull()).
 * @return A boolean value specifying the list is full or empty.
 */
public boolean isFull() {
	if(this.length == this.Maxlength) {
		return true;
	}
	else {
		return false;
	}
}

/**
 * check to see if the bag is empty( isEmpty()).
 * @return A boolean value specify if the list is empty.
 */
public boolean isEmpty() {
	if(this.length == 0){
		return true;
	}
	else{
		return false;
	}
}

/**
 * Completely empty the bag (makeEmpty()).
 * @return Count is 0.
 */
public void makeEmpty() {
	this.list = new Object[this.Maxlength];
	this.length = 0;
}

}
