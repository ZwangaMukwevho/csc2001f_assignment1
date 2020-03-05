import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;


/** 
        * This class reads has two methods that print out data from arrays 
        * On of the methods searches for all of a specific item in the array and the other method prints out all the items
        * It also calculates the number of comparisons used when searching for an item in an array  
        * And the number of comparisons made when calculating the array
        */
public class loadshedData
{	
        /** 
	*This method searches for this key in an array and also calculate the number of comparisons made when searching
	*@param which represent a key that is to be searched for in an array
	*@return the number of comparisons made and print out the item if it was found in an the array of interest
	*/
	public static int printAreas(String a, String b, String c) throws FileNotFoundException
	{
	int opCount = 0;
	String check = "True";
	String zones;
	String time;

	LSArray LSobj = new LSArray();
	String key = a + "_"+b+"_"+c;
	String[] LSdata = LSobj.DataCollection("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
	String[] keydata = LSobj.keys(LSdata);
	
	int size = LSdata.length;
	for(int i = 0;i < size;i++){
		opCount = opCount + 1;
		if (key.equals(keydata[i])){
			System.out.format("match found was %s ",LSdata[i]);
			System.out.println("Which means: ");
			String[] tempArr= LSdata[i].split("\\s");
			System.out.format("Stage %s , on the %sth , at %s:00 ",a,b,c);			
			System.out.format("At zone %s ",tempArr[1]);
			System.out.println("Number of insert comparisons is 0");
			check = "false";
			return opCount;	
					}
			   	   };
	if(check.equals("True")){
		System.out.format("no matches found for %s",key);
		System.out.println("Number of insert comparisons is 0");}
	return opCount;	
			
	}

	/** 
	*This methed reads a text file and then print out each line of the text file
	*@return void
	*/
	public static void printAllAreas() throws FileNotFoundException
	{
	LSArray LSobj = new LSArray();
	String[] LSdata = LSobj.DataCollection("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
	int size = LSdata.length;

	for(int i = 0;i < size;i++){
		System.out.println(LSdata[i]);	
			   	   };
	System.out.println("");
	System.out.println("Number of insert comparisons is 0");
		
	}
	

	
	
}
