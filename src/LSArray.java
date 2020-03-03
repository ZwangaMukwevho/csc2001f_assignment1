import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
import java.util.Arrays;
  
public class LSArray 
{ 
  public static void main(String[] args) 
                        throws FileNotFoundException 
  { 
    //DataCollection("sample.txt");
    //keys(DataCollection("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt"));
 
  } 

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
