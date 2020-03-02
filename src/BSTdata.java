import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;

public class BSTdata{
public static void main(String[] args) 
                        throws FileNotFoundException 
  { 
    //DataCollection("sample.txt");
    //BinarySearchTree<String> BSTobj = new BinarySearchTree<String>();
    //DataCollection1("output.txt",BSTobj); 
    //printAreas1("1","1","00");
 
  } 

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

	public static int printAreas1(String a, String b, String c) throws FileNotFoundException
	{
	String key = a + "_"+b+"_"+c;
	BinarySearchTree<String> BSTobj = new BinarySearchTree<String>();
        DataCollection1("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt",BSTobj);
	BSTobj.visit(BSTobj.find(key));
	
	return BSTobj.countOps();		
	}

	public static void printAllAreas1() throws FileNotFoundException
	{
	BinarySearchTree<String> BSTobj = new BinarySearchTree<String>();
        DataCollection1("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt",BSTobj);
	BSTobj.inOrder ();		
	}

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

