import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.io.PrintWriter;  

public class part5{
public static void main(String[] args) 
                        throws FileNotFoundException, Exception 
  { BSTdata BSTdataobj = new BSTdata();
    File file = new File(args[0]); 
    Scanner sc = new Scanner(file);
    PrintWriter writer = new PrintWriter(args[1], "UTF-8");
    String line;


	while(sc.hasNextLine())
	{
	line = sc.nextLine();
	String[] tempArr= line.split("\\s");

	int[] CountArr = new int[2];
	CountArr = BSTdata.printAreas2(tempArr[1], args[0] );
	
	writer.println(CountArr[0]);
	writer.println("The second line");
	writer.println(CountArr[1]);
	writer.println("The second line");
	

	}
     writer.close();

    //DataCollection("sample.txt");
    //BinarySearchTree<String> BSTobj = new BinarySearchTree<String>();
    //DataCollection1("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt",BSTobj);
 
  } 


}
