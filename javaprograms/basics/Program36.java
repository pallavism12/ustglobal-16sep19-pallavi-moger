import java.io.File;
class Program36
{
	public static void main(String[] args) {
		
	
	System.out.println();
	String path="D:/FILEHANDLING";
	File f1=new File(path);
	if(f1.exists()==false)
	{
		f1.mkdir();
		System.out.println("new folder created");

	}
	else
	{
		System.out.println("folder already exists");
	}
}	
}