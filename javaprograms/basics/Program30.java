//import java.util.Thread;
class Taskone extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
		System.out.println("load photo");
	}
}
class Tasktwo extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
		System.out.println("load video");
	} 	}

}
class Program30
{
	public static void main(String[] args) {
		Taskone tk1=new Taskone();
		Tasktwo tk2=new Tasktwo();

		tk1.start();
		tk2.start();



	}
}