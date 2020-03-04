import java.io.File; 
import java.io.FileNotFoundException; 

/** 
        * This class is a driver class that runs methods of the loadshedData class
        * It uses the arguments taken from the command line as arguments to methods it runs
	* It specifically runs two methods, one for printing out all areas and the other for printing out searched areas
        */
class LSArrayApp
{

	/** @return void
	*This method prints out the areas to the command line
	*/
	public static void main(String[] args) throws FileNotFoundException
	{
	loadshedData LSDobj = new loadshedData();


	if(args.length==3){
	int x;
	x = LSDobj.printAreas(args[0],args[1],args[2]);
	System.out.println("");
	System.out.format("number of search operations is: %d: ",x);
	System.out.println("");

	}
	
	else{
	LSDobj.printAllAreas();
	
	}
}}
