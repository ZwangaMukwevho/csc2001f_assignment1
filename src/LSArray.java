import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
import java.util.Arrays;
 /** 
        * This class reads in data from the textfile that inludes loadshedding schedules and stores each line in array 
        * It also stores the keys seperately in each line  
        * The text in each file is read in using the scanner class by using Scanner class.  
        * @aurthor: Zwanga
        */
public class LSArray 
{ 
        /** 
	*It then reads each line in the text file and store each line in an array
	*@param This methed takes in a file name as its parameter
	*@return an the array that stores the text file lines
	*/
	public static String[] DataCollection(String a) throws FileNotFoundException {
	File file = new File(a); 
 	Scanner sc = new Scanner(file); 
 
        // Counter variable to count the number of entries in text file
	int counter = 0;

	
        
	String[] data = new String[2976];
        // While loop to take in data from text file 
	while(sc.hasNextLine())
	{
	
	sc.useDelimiter("\\Z"); 
	
	// Inserting data in each line to array
	data[counter] = sc.nextLine();
	counter = counter + 1;
	
	}
	return data;
 	}
	
	/** 
	*@param methed takes in an Array of text line
	*The each item in the array, an take the first word contained in that item and stores it a new array of keys.
	*@returns an array of keys
	*/

	public static String[] keys(String [] Arr) 
	{
	int size = Arr.length;
	String[] keyArr = new String[size];
	String key;

	for(int i = 0; i<size; i ++){
	String[] tempArr= Arr[i].split("\\s");
	keyArr[i] = tempArr[0];

	}
	return keyArr;

	
	
	
	}


	


} 
