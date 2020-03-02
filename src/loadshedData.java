import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;

public class loadshedData
{
	//String key;
	//String areas;
	//public LoadShedData(String k, String a)
	//{
	//key = k;
	//areas = a;
	//}
	

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
}
