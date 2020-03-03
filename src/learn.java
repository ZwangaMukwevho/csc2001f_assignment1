import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.io.PrintWriter; 
public class learn{
	public static void main(String[] args) 
                        throws FileNotFoundException {
	int a = 0;}

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
