import java.io.File; 
import java.io.FileNotFoundException; 
class LSBSTApp
{
	public static void main(String[] args) throws FileNotFoundException
	{
	//LoadshedData LSDobj = new LoadshedData();
	BSTdata BSTdataobj = new BSTdata();
	if(args.length==3){
	int x;
	x = BSTdataobj.printAreas1(args[0],args[1],args[2]);
	System.out.println("");
	System.out.format("number of operations is: %d: ",x);
	System.out.println("");

	}
	
	else{
	BSTdataobj.printAllAreas1();
	
	}
}}
