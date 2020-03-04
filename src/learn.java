import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.io.PrintWriter; 
/** 
         
	* This class is a combination of the LSarray and loadshedData class but it allows taking in of different text files
	* Its main purpose is for it to be run on a shell script for different text file inputs 
        * @aurthor: Zwanga
*/

public class learn{
	public static void main(String[] args) 
                        throws FileNotFoundException {
	int a = 0;}

	 /** 
	*It then reads each line in the text file and store each line in an array
	*@param This methed takes in a file name as its parameter
	*@return an the array that stores the text file lines
	*/
	public static String [] collectData(String a) throws FileNotFoundException{
	File file = new File(a); 
 	Scanner sc = new Scanner(file);

	String[] data = new String[2976];
	String line;

	int counter = 0;
	while(sc.hasNextLine())
	{
	line = sc.nextLine();
	data[counter] = line;
	counter = counter + 1;
	
	} 
	return data;
	}
	
 /** 
	*This method searches for this key in an array and also calculate the number of comparisons made when searching
	*@param String which represent a key that is to be searched for in an array and name of file to be opened
	*@return the number of comparisons made when searching for the key
	*/
	public static int printA(String a, String b) throws FileNotFoundException
	{
	String key = a;
	int count = 0;
	String[] arr = collectData(b);
	
	int size = arr.length;
	for(int i = 0; i<size; i++){
		count= count + 1;
	 try{
 	  String[] tempArr= arr[i].split("\\s");
	  if(key.equals(tempArr[0])){
		int p = 0;
		break;
		}
	    }
	catch(NullPointerException e) 
        { 
           break; 
        } 
	  			
					}
	return count;
	
	}

}
