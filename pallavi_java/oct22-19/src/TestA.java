
public class TestA {
	

	public static void add(double a, int b) {
		System.out.println("add(double a, int b) method ");
	}

	public static void add(double a, double b) {
		System.out.println("add(int a, byte b) method ");	
	}
	
	public  void multiply(int a, int b) {
		System.out.println("multiply method (int a, int b) method ");
		
	}
	
	public  void multiply(byte a, int b) {
		System.out.println("mul tiply method (int a, int b) method ");
	
	}
	public static void main(String[] args) {
		System.out.println("main string method");
		main(10);
		add(10,20);
		add(10.2,65);
		
		add(98.0,36.0);
		TestA t=new TestA();
		t.multiply(12,45);
		t.multiply(12,34);
	}
	
	public static void main(int a) {
		System.out.println("main int method");
	}

}
