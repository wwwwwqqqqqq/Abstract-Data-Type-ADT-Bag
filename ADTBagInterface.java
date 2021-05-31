package ADT;

/**
 * Specifications on the design of ADTBag operations. 
 * @author Qin Weiwei
 * @version 3.0
 */
public interface ADTBagInterface {
	
	/**
	 * Insert an item to the list at position item.
	 * @param item A reference to this insert element.
	 * @throws ADTBagException If count > size().
	 */
	public void insert(Object item) throws ADTBagException;
	
	/**
	 * Construct a method to remove the last item put in the bag.
	 */
	public void removeLast();
	
	/**
	 * Construct a method to remove a random item from the bag.
	 */
	public void removeRandom();
	
	/**
	 * Return a value to this get element.
     * @param item An object specifying the identical item.
     * @return An object specifying the retrieved item.
     */
	public Object get(Object item);
	
	/**
	 * Returns an element by position.
	 * @param index A reference to this get element. 
	 * @return An object specifying the retrieved item.
	 * @throws ADTBagLengthOutOfBoundsException If index < 0 or index > size().
	 */
	public Object get(int index) throws ADTBagLengthOutOfBoundsException;
	
	/**
	 * Check how many items are in the bag.
     * Return the length of the list in integer.
     * @return An integer length of the bag.
	 */
	public int size();
	
	/**
	 * Check to see if the bag is full.
     * @return A boolean value specifying the list is full or empty.
     */
	public boolean isFull();
	
	/**
	 * check to see if the bag is empty.
     * @return A boolean value specify if the list is empty.
	 */
	public boolean isEmpty();
	
	/**
	 * Completely empty the bag (makeEmpty()).
     * @return Count is 0.
	 */
	public void makeEmpty();
}
