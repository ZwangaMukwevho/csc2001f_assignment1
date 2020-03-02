import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.io.PrintWriter;  

public class part5{
public static void main(String[] args) 
                        throws FileNotFoundException, Exception 
  { 
    BSTdata BSTdataobj = new BSTdata();
    File file = new File(args[0]); 
    Scanner sc = new Scanner(file);
    PrintWriter writer = new PrintWriter(args[1], "UTF-8");
    String line;
    String Outputline;

    // Heading of output textfile
    Outputline = String.format("%20s %20s \r\n", "find comparisons", "insert comparisons");	
    writer.println(Outputline);
	

	while(sc.hasNextLine())
	{
	line = sc.nextLine();
	String[] tempArr= line.split("\\s");

	int[] CountArr = new int[2];
	CountArr = BSTdata.printAreas2(tempArr[0], args[0] );
	
        Outputline = String.format("%20d %20d \r\n", CountArr[0], CountArr[1]);	
	writer.println(Outputline);

	}
     writer.close();

    //DataCollection("sample.txt");
    //BinarySearchTree<String> BSTobj = new BinarySearchTree<String>();
    //DataCollection1("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt",BSTobj);
 
  } 


}
