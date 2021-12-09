package PackageProject1_1;
/**
 * Representing a ADT with a name.
 * @author Yulong Chen
 * @version 1.1
 */
public interface ADT{
	
	/**
	 * Insert data to the end of bag
	 * @param data The name of insert items
	 */
	public void insert(Object data) ;
	
	/**
	 * Remove the last item
	 */
	public void removeLast();
	
	/**
	 * Random remove an element
	 */
	public void removeRandom();
	
	/**
	 * Get an index of the data
	 * @param data The name of item
	 */
	public void getIndex(Object data);
	
	/**
	 * Get a item in the a index
	 * @param a The index of item
	 */
	public void getItem(int a);
	
	/**
	 * Get the number of items
	 */
	public void size();
	
	/**
	 * Check the bag is null or not null
	 */
	public void isEmpty();
	
	/**
	 * Remove all items
	 */
	public void makeEmpty();
}
