import java.io.File;
import java.io.IOException;
class Program37
{
	public static void main(String[] args) {
		System.out.println("program starts");

		String path="D:/FILEHANDLING/FileOne.txt";
		File f1=new File(path);
		
		if(f1.exists()==false)
		{
			try
			{
				f1.createNewFile();
				System.out.println("new file created");
			}
			catch(IOException ie)
			{
				ie.printStackTrace();
			}
		}	
		
		else
		{
			System.out.println("file already exists");
		}
		System.out.println("program ends");
	}
}