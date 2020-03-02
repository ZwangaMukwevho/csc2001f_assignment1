import java.io.File; 
import java.io.FileNotFoundException; 
class LSArrayApp
{
	public static void main(String[] args) throws FileNotFoundException
	{
	//LoadshedData LSDobj = new LoadshedData();
	loadshedData LSDobj = new loadshedData();

	
	//if(args.length==3)
	//	(new LSArrayApp()).printAreas(args[0],args[1],args[2]);
	//else
	//	(new LSArrayApp()).printAllAreas();
	//}

	if(args.length==3){
	int x;
	x = LSDobj.printAreas(args[0],args[1],args[2]);
	System.out.println("");
	System.out.format("number of operations is: %d: ",x);
	System.out.println("");

	}
	
	else{
	LSDobj.printAllAreas();
	
	}
}}
