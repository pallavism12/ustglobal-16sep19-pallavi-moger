import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Program33
{
	public static void main(String[] args) {
		System.out.println("program strs");
		Runnable r1=()->
		{
			System.out.println("login task");	
		};
		Runnable r2=()->
		{
			System.out.println("logout task");
		};
		ExecutorService es1=Executors.newFixedThreadPool(4);
		es1.execute(r1);
		es1.execute(r2);
		es1.shutdown();
		System.out.println("program ends");

	}
}