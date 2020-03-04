import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.io.PrintWriter;  

/** 
        * This class is used to run automate the running of part 1 and part 4 for different time intervals
	* It is run through a python script called python.py
	*@aurthor Zwanga Mukwevho
        */

public class part5{
/** 
        * This method uses BSTdata objects and the learn object for comparisons of the BST and linear array
        * It writes out the comparisons done over a certain interal into a text file
	*@return void
        */
public static void main(String[] args) 
                        throws FileNotFoundException, Exception 
  { 
    //Object that gets method for functions used in part 3 and part 4
    BSTdata BSTdataobj = new BSTdata();
    File file = new File(args[0]); 
    Scanner sc = new Scanner(file);
    PrintWriter writer = new PrintWriter(args[1], "UTF-8");
    String line;
    String Outputline;

    //Object that gets method for functions used in part 1 and part 2
    learn LObj = new learn();
    int count=0;
    

    // Heading of output textfile
    Outputline = String.format("%13s %13s  %13s %13s \r\n", "BST_find |", " BST_insert |", "LSA_find |","LSA_insert |");	
    writer.println(Outputline);
	

	while(sc.hasNextLine())
	{

	// Tests code for part3 and part 4
	line = sc.nextLine();
	String[] tempArr= line.split("\\s");
	
	
	int[] CountArr = new int[2];
	CountArr = BSTdata.printAreas2(tempArr[0], args[0]);
	count = learn.printA(tempArr[0],args[0]);
	
        Outputline = String.format("%15d %15d %15d %15d \r\n", CountArr[0], CountArr[1], count, 0);	
	writer.println(Outputline);

	// Tests code for part 1 and part 2
	
	}
     writer.close();

    
 
  } 




}
