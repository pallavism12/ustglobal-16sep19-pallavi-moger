import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
class Program38
{
	public static void main(String[] args) {
		System.out.println("program starts");

		String path="D:/FILEHANDLING/FileOne.txt";
		File f1=new File(path);

		try
		{
			FileWriter fw=new FileWriter(f1);
			fw.write("hey this is Pallavi");
			fw.flush();
			System.out.println("file writing completed");
		}
		catch(IOException ie)
		{
			ie.printStackTrace();

		}

		System.out.println("program ends");


	}
}
