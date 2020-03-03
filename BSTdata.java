package exa;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;

	/** 
        * This class is the utilities file for collecting data from a text file 
	* It stores this data in a text file 
        * It all also prints out the lines in the file through searching or printing out all the lines
        */
public class BSTdata{

	/** 
        * This class is the utilities file for collecting data from a text file 
        * It then stores this data in a BinarySearch Tree
	* The method also takes in the name of the text file and the a BST object as parameters
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
        * This prints out data in a node by searching through the node
        * This method takes in strings as parameters for searching through the node
	* It returns the number of comparisons made when searching for the particular item
        */
	
	public static int printAreas1(String a, String b, String c) throws FileNotFoundException
	{
	String key = a + "_"+b+"_"+c;
	BinarySearchTree<String> BSTobj = new BinarySearchTree<String>();
        DataCollection1("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt",BSTobj);
	BSTobj.visit(BSTobj.find(key));
	
	return BSTobj.countOps();		
	}

	/** 
        * This prints out all the data in a BST using an inorder traversal
        */
	public static void printAllAreas1() throws FileNotFoundException
	{
	BinarySearchTree<String> BSTobj = new BinarySearchTree<String>();
        DataCollection1("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt",BSTobj);
	BSTobj.inOrder ();		
	}
	
	/** 
        * This prints out data in a node by searching through the node
        * This method takes in strings as parameters for searching through the node
	* It returns the number of comparisons made when searching and inserting the item in form of an array
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

