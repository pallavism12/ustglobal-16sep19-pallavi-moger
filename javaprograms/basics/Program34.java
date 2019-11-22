import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
 public class  Program34
 {
 	public static void main(String[] args) {
 		{
 			System.out.println("program starts");
 			Runnable r1=()->
 			{
					System.out.println("login task");
 			};
 			Runnable r2=()->
 			{
 					System.out.println("logout task");
 			};
 			ExecutorService es1=Executors.newCachedThreadPool();
 			es1.execute(r1);
 			es1.execute(r2);
 			es1.shutdown();
 			System.out.println("program ends");
 		}
 	}
 }



