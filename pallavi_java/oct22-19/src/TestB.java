
public class TestB {
	int c;
	static  int a=200;
	public static void add() {
		final	int a=10;
		int b=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println( new TestB().c);
		}
	public static void main(String[] args) {
		add();
	}
}

