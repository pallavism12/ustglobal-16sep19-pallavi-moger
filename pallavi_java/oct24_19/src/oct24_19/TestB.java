package oct24_19;

public class TestB {
	static int b;
	int a;
	{
		a=10;
		b=20;
		System.out.println("non staic block 1");
	}

	public static void main(String[] args) {
		System.out.println("main started");
		TestB t1=new TestB();
		TestB t2=new TestB();
		System.out.println("main ended");
		
		
		
	}
	{
		
		System.out.println("non static block 2");
	}


}
