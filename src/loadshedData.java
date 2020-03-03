import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;

public class loadshedData
{	

	public static int printAreas(String a, String b, String c) throws FileNotFoundException
	{
	int opCount = 0;

	LSArray LSobj = new LSArray();
	String key = a + "_"+b+"_"+c;
	String[] LSdata = LSobj.DataCollection("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
	String[] keydata = LSobj.keys(LSdata);
	
	int size = LSdata.length;
	for(int i = 0;i < size;i++){
		opCount = opCount + 1;
		if (key.equals(keydata[i])){
			System.out.println(LSdata[i]);
					}
			   	   };
	
		return opCount;		
	}

	public static void printAllAreas() throws FileNotFoundException
	{
	LSArray LSobj = new LSArray();
	String[] LSdata = LSobj.DataCollection("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
	int size = LSdata.length;

	for(int i = 0;i < size;i++){
		System.out.println(LSdata[i]);	
			   	   };
		
	}
	

	// For testing LinearSearchArray part 5
	public static int printAreas3(String a, String b) throws FileNotFoundException
	{
	int opCount = 0;
	String test;
	String key = a;
	String[] LSdata = DataCollection2(b);
	
	int size = LSdata.length;
	for(int i = 0;i < size;i++){
		opCount = opCount + 1;
		String[] tempArr= LSdata[i].split("\\s");
		if (key.equals(tempArr[0])){
			test = "a";
					}
			   	   };
	
		return opCount;		
	}

	public static String[] DataCollection2(String a) throws FileNotFoundException {
	String[] entries = new String[2976];
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
	entries[counter] = sc.nextLine();
	
	// Inserting data in each line to array
	counter = counter + 1;
	
	}
	return entries;
	
 	}
}
