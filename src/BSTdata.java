import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;

/** 
        * This class reads in data from the textfile that inludes loadshedding schedules and stores each line in array 
        * It the stores each line in a Binary Search Tree node. 
        * The text in each file is read in using the scanner class by using Scanner class.  
        * @author: Zwanga
*/

public class BSTdata{
 	/** 
	*It then reads each line in the text file and store each line in a BinarySearchTree node
	*@param This methed takes in a file name as its parameter, it also takes in a BinarySearchTreeObject
	*@return void
	*/

	public static void DataCollection1(String a,BinarySearchTree<String> node) throws FileNotFoundException {
	
	File file = new File(a); 
 	Scanner sc = new Scanner(file); 
 
        // Counter variable to count the number of entries in text file
	int counter = 0;
	String line;
	

        // While loop to take in data from text file 
	while(sc.hasNextLine())
	{
	line = sc.nextLine();
	//sc.useDelimiter("\\Z"); 
	String[] tempArr= line.split("\\s");
	
	// Inserting data in each line to array
	counter = counter + 1;
	node.insert(line,tempArr[0]);
	
	}
	
 	}
	
	 /** 
	*searches for key in a BinarySearchTree and also calculate the number of comparisons made when searching
	*@param Strings which represent a key that is to be searched for in an array
	*@return the number of comparisons made when searching and print out the item if it was found in an the array of interest
	*/
	public static int printAreas1(String a, String b, String c)  throws FileNotFoundException
	{
	String check = "false";
	String key = a + "_"+b+"_"+c;
	BinarySearchTree<String> BSTobj = new BinarySearchTree<String>();
        DataCollection1("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt",BSTobj);
	
	try{
	String value = BSTobj.find(key).data;
	System.out.format("match found was %s ",value);
	System.out.println("Which means: ");
	String[] tempArr4= value.split("\\s");
	System.out.format("Stage %s , on the %sth , at %s:00 ",a,b,c);			
	System.out.format("At zone %s ",tempArr4[1]);
	System.out.format("Number of insert comparisons is %d", BSTobj.SearchCount());
	    }
	catch(NullPointerException e) 
        { 
	   System.out.format("no match was found for: %s",key);
	System.out.println("");
	   System.out.format("Number of insert comparisons is %d", BSTobj.SearchCount());
           int i = 0;
        } 			
	
	return BSTobj.countOps();			
	}

	/** 
	*This methed reads a text file, loads it to a BinarySearchTree, and traverses though the Tree inOrder
	*@return void
	*/
	public static void printAllAreas1() throws FileNotFoundException
	{
	BinarySearchTree<String> BSTobj = new BinarySearchTree<String>();
        DataCollection1("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt",BSTobj);
	BSTobj.inOrder ();
	System.out.format("Number of insert comparisons is %d", BSTobj.SearchCount());
			
	}

	 /** 
	* method used for part 5 when automating the searching process
	*searches for key in a BinarySearchTree and also calculate the number of comparisons made when searching
	*@param Strings which represent a key that is to be searched for in an array
	*@return the number of comparisons made when searching and print out the item if it was found in an the array of interest
	*/
	public static int[]  printAreas2(String c, String d ) throws FileNotFoundException
	{
	String key = c;
	BinarySearchTree<String> BSTobj = new BinarySearchTree<String>();
        DataCollection1(d,BSTobj);
	BSTobj.find(key);
	
	// Output
	int[] keyArr = new int[2];
		keyArr[0] = BSTobj.countOps();		
		keyArr[1] = BSTobj.SearchCount();		
	
	return keyArr;		
	}
	
	
}
