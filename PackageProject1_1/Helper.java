package PackageProject1_1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * Representing a Helper with a name.
 * @author Yulong Chen
 * @version 1.1
 */
public class Helper{
	
	/**
	 * Count the number of items
	 */
	public static int index = 0;
	
	/**
	 * Record the number of Initial
	 */
	public static int count = -1;
	
	/**
	 * Execute some operations
	 * @throws Exception 
	 */
	public static void start() { 
		//Call the constructor with parameter
		ADT_Data a = new ADT_Data(new Object[100]);
		try {
			create(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Test
		display(a);
		a.insert("Banana");
		a.insert("Water");
		display(a);
		a.isEmpty();
		a.removeLast();
		display(a);
		a.removeRandom();
		display(a);
		a.getIndex("water");
		a.getIndex("Apple");
		a.getItem(2);
		a.size();
		a.makeEmpty();
		display(a);
		a.size();
	}
	
	/**
	 * Add the items into the bag
	 * @param a2 Calling the ADT_Data
	 * @throws IOException
	 */
	public static void create(ADT_Data a2) throws IOException {
		Object line;
		//Create a path
		String filepath = System.getProperty("user.dir")+"/src/IO/ADT_test.txt";
		//Create a object 
		Scanner sc = new Scanner(new File(filepath));
		while(sc.hasNext()){
			//Read line by line
			line = sc.nextLine();
			count++;
			try {
				a2.insertBegin(line);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//Make sure the index
		for(int x = 0 ; x<a2.array.length; x++) {
			if(a2.array[x] != null)
				Helper.index++;
		}
	}
	
	/**
	 * Display the list of items in the bag
	 * @param a2
	 */
	public static void display(ADT_Data a2) {
		int a = 0;
		if(index == 0) {
			System.out.println("No items to display.\n");
		}else {
		for(int i = 0 ; i<index ; i++) {
			a= i+1;
			System.out.println(a + ":"+ a2.array[i]);
		}
		System.out.println("");
		}
	}
}

