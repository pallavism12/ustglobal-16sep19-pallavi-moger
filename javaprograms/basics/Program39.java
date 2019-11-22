import java.io.File;
import java.io.IOException;
import java.io.FileReader;

class Program39
{
	public static void main(String[] args) {
		System.out.println("program starts");

		String path="d:/filehandling/FileOne.txt";
		File f1=new File(path);

		try
		{
			FileReader fr=new FileReader(f1);
			int len=(int)f1.length();
			char[] arr=new char[len];
			fr.read(arr);
			System.out.println(arr);


		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
		System.out.println("program ends");
	}
}		