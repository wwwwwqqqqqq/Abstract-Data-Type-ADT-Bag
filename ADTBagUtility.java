package ADT;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * A helper class.
 * @author Qin Weiwei
 * @version 3.0
 */

//decomposed into more methods (for example, fillList, displayList) in a separate class
public class ADTBagUtility {
	/**
	* Creates a bag of items, and change items in the bag, and displays items.
	* @throws FileNotFoundException 
	*/
	public static void start() throws FileNotFoundException{
	ADTBagArrayBased list = new ADTBagArrayBased();
	
	//Check to see if the bag is empty.
	System.out.println("The bag is empty?");
	System.out.println(list.isEmpty());
		
	System.out.println("-----------------------------");
			
	
	//Fill the bag.
	//A Scanner object must be used to read item information from a file. 
	//Items need to be created before they are put into the bag. 
	fillList(list);
	
	//Display items in the bag. 
	System.out.println("The items in the bag are: ");
	displayList(list);
	
	System.out.println("-----------------------------");
	
	//Insert an item in the bag.
	System.out.println("Insert :( to the bag at the last line: ");
	list.insert(":(");
	displayList(list);
	
	System.out.println("-----------------------------");
	
	//Remove the last item put in the bag.
	list.removeLast();
	System.out.println("The items in the bag after remove the last one item: ");
	//Display items in the bag after remove the last one item.
	displayList(list);
	
	System.out.println("-----------------------------");
	
	//Remove a random item from the bag.
	list.removeRandom();
	System.out.println("The items of the bag after remove a random item: ");
	//Display items of the bag after remove a random item.
	displayList(list);
	
    System.out.println("-----------------------------");
			
    //Get an item(5/Qin Weiwei) from the bag.
	System.out.println("Get an item from the bag: ");
	System.out.println("We get " + list.get("Qin weiwei") + " from the bag.(Test1)");
	System.out.println("We get " + list.get("5") + " from the bag.(Test2)");
	System.out.println("We get " + list.get("5") + " from the bag.(Test3)");
	
			
	System.out.println("-----------------------------");
	
	//Get an item at index(2) from the bag.
	System.out.println("Get an item at index from the bag: ");
	System.out.println("We get " + list.get(2) + " from the bag.");

	System.out.println("-----------------------------");
	
	//Check how many items are in the bag.
	System.out.println("The number of items in the bag is: ");
	System.out.println(list.size());

	System.out.println("-----------------------------");
	
	//Check to see if the bag is full.
	System.out.println("The bag is full?");
	System.out.println(list.isFull());

	System.out.println("-----------------------------");
	
	//Check to see if the bag is empty.
	System.out.println("The bag is empty?");
	System.out.println(list.isEmpty());

	System.out.println("-----------------------------");
	
	//Completely empty the bag.
	System.out.println("Make the bag empty.");
	
	list.makeEmpty();
	System.out.println("I have made the bag empty.");
	
	System.out.println("------------------------------");
	
	//Check to see if the bag is empty.
	System.out.println("The bag is empty?");
	System.out.println(list.isEmpty());

	}
	
	/**
	 * Stores items into a bag.
	 * @param list A reference to a bag
	 * @throws FileNotFoundException 
	*/
	public static void fillList(ADTBagArrayBased list) throws FileNotFoundException{ 
	//add items into the bag and/or remove items from the bag.
	//All operations in ADT Bag design must be used/tested here.
		
		Scanner file = new Scanner(new File("Test1.txt"));
		//Scanner file = new Scanner(new File("Test2.txt"));
		//Scanner file = new Scanner(new File("Test3.txt"));
		
		int i = 0;
		while(file.hasNext())
		{
			//Put an item in the bag.
			list.insert(file.nextLine());
			i ++;
		}
		//close the file
		file.close();
		
		/*for(int i = 0;i < file.hasNext();i ++) {
			
		}*/
	}
	
	/**
	 * Displays items in the bag.
	 * @param list A reference to a bag
	 */
	public static void displayList(ADTBagArrayBased list){
		for(int i = 0;i < list.size();i ++) {
			System.out.println(list.get(i));
		}
		}
}