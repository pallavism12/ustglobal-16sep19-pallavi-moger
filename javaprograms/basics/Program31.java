class Superclass
{

}
class Taskone extends Superclass implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println("load photo");
		}
	}
}
class Program31
{
	public static void main(String[] args) {
		Taskone tk=new Taskone();
		Thread td=new Thread(tk);
		td.start();
	}
}