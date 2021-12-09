package PackageProject1_1;
/**
 * Representing a ADT_Data with a name.
 * @author Yulong Chen
 * @version 1.1
 */
public class ADT_Data implements ADT{
	/**
	 * The bag store in Object[], and called array
	 */
    public Object[] array;
    
    /**
     * Constructor a newly created ADT_Data object that represents an Array with an empty name.
     */
	public ADT_Data() {}
	
	/**
	 * Constructor a newly created ADT_Data object that represents an Array with an name.
	 * @param array The name of the Array
	 */
	public ADT_Data(Object[] array){
		this.array = array;
	}

	/**
	 * Insert item to bag
	 * @param data The name of insert item
	 * @throw rrayIndexOutOfBoundsException
	 */
	@Override
	public void insert(Object data) {
		//Guarantee the array in a right area
		if(Helper.index == this.array.length) {
			throw new ArrayIndexOutOfBoundsException("The array is full and cannot add any items.");
		}
		//Get array a value in last index
		this.array[Helper.index] = data;
		//The index add one
		Helper.index++;
	}
	
	/**
	 * Initializing the array
	 * @param data The name of items from file
	 */
	public void insertBegin(Object data) {
		//Initializing all items from file
		this.array[Helper.count] = data;
	}
	
	/**
	 * Remove the last item
	 * @throw IndexOutOfBoundsException
	 */
	@Override
	public void removeLast() {
		//Guarantee the array in a right area
		if(Helper.index == 0) {
			throw new IndexOutOfBoundsException("The bag is empty, no items can remove. ");
		}
		//Make the last null
		this.array[Helper.index] = null;
		Helper.index--;
	}

	/**
	 * Random remove a item from the bag
	 * @throw IndexOutOfBoundsException
	 */
	@Override
	public void removeRandom() {
		//Guarantee the array in a right area
		if(Helper.index == 0) {
			throw new IndexOutOfBoundsException("The bag is empty, no items can remove. ");
		}
		//Make a is the number of items
		int a = Helper.index;
		//Make domain of x is 0 to the number of elements
		int x = (int)(1 + Math.random() * (a));
		for(int i = 0; i < (a-x); i++) {
			//Assign the next element to the previous element 
			this.array[x+i-1] = this.array[x+i];
		}
		//Make the last item null
		this.array[a-1] = null;
		Helper.index--;
	}

	/**
	 * Get the index of the item
	 * @param data The name of item
	 */
	@Override
	public void getIndex(Object data) {
		for(int i = 0; i < Helper.index; i++) {
			//Equal whether data is same as item in the bag
			if(this.array[i].equals(data)) {
				System.out.println("The index of " + data + " is " + (i + 1) +".\n");
		        break;
		    //When reach the last index
			}else if(i == Helper.index - 1)
			
			    System.out.println("The bag have not '" + data + "' item.\n");
		}	
	}
	
	/**
	 * Get the item in the a index
	 * @param a The index of item
	 * @throw ArrayIndexOutOfBoundsException
	 */
	@Override
	public void getItem(int a) {
		//Make the value of index located in right range
		if(a < 0 ||  a > Helper.index) {
			throw new ArrayIndexOutOfBoundsException("Index does not exist in the bag£¡");
		}
		System.out.println("In the position:"+ a +", The item is " + this.array[a-1] + ".\n");
	}
	
	
	/**
	 * Get the number of elements
	 */
	@Override
	public void size() {
		//Use n to record the number of items
		int n = 0;
		for(int i = 0; i < Helper.index; i++) {
			if(this.array[i] != null) {
				n++;
			}
		}
		System.out.println("The size of bag is " + n + ".\n");
	}

	/**
	 * Check the bag is null or not null
	 */
	@Override
	public void isEmpty() {
		//if the bag is null
		if(Helper.index == 0)
			System.out.println("The bag is null.\n");
		for(int i = 0; i < Helper.index; i++) {
			//exist a item is not null
			if(this.array[i] != null) {
				System.out.println("The bag is not null.\n");
				break;
			}
		}
	}

	/**
	 * Remove all elements
	 */
	@Override
	public void makeEmpty() {
		for(int i = 0; i < Helper.index; i++) {
			//Assign every items null
			this.array[i] = null;
		}
		//Make the index null
		Helper.index = 0;
	}
}
