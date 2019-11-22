import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
 public class  Program35
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
 					System.out.println("load photos");
 			};
 			Runnable r3=()->
 			{
 					System.out.println("load videos");
 			};
 			

 			ScheduledExecutorService es1=Executors.newScheduledThreadPool(3);
 			es1.execute(r1);
 			es1.scheduleAtFixedRate(r2,1,5,TimeUnit.SECONDS);
 			es1.schedule(r3,1,TimeUnit.SECONDS);
 		
 			es1.shutdown();
 			System.out.println("program ends");
 		}
 	}
 }



