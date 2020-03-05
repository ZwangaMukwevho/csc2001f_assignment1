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

    // Variable to hold average case, worst and best case for each dataset
    int avaragecase = 0;
    int bestcase = 100000; //impossible by default,
    int worstcase = 0;
    int counter = 0;

    // Array best, worst and avarage case
    int ArrayBestcase = 0;
    int ArrayWorstcase = 0;
    int ArrayAveragecase = 0;

	

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

	// Calculating best, worst and avarage case for BST
	counter = counter + 1;
	avaragecase = avaragecase + CountArr[0];
	
        //bestcase
	int[] bestcaseArr = new int[1];
	bestcaseArr[0] = CountArr[0];
	if(bestcaseArr[0]<=bestcase){
	bestcase = bestcaseArr[0];}
	
	
	//worstcase
	int[] worstcaseArr = new int[1];
	worstcaseArr[0] = CountArr[0];
	if(worstcaseArr[0]>=worstcase){
	worstcase = worstcaseArr[0];}

	//best always the first item, therefore first item gives best case
	if(counter == 1){
	ArrayBestcase = count;
		}

	//calculating avaragecase of array
	ArrayAveragecase = ArrayAveragecase + count;
	

	}
	
	//worstcase always the last item, therefore last item gives worst case
	ArrayWorstcase = count;
	ArrayAveragecase = ArrayAveragecase/counter;
	
	avaragecase = avaragecase/counter;

	writer.println("BST search cases");
	Outputline = String.format("%13s %13s %13s \r\n","BestCase |", " WorstCase |", "AverageCase|");
	writer.println(Outputline);
	Outputline = String.format("%13d %13d %13d  \r\n", bestcase, worstcase,avaragecase);
	writer.println(Outputline);
	
	writer.println("Array search Cases");
	Outputline = String.format("%13s %13s %13s \r\n", "BestCase |", " WorstCase |", "AverageCase|");
	writer.println(Outputline);
	Outputline = String.format("%13d %13d %13d  \r\n",ArrayBestcase , ArrayWorstcase,ArrayAveragecase);
	writer.println(Outputline);

	
	
     writer.close();

    
 
  } 




}
