package oct23_19;

public class BMW  implements Auto,AutoWithAbs{
	public int gear() {
		System.out.println("gear of BMW");
		return 20;
	}
	public	void gps() {
		System.out.println("gps of BMW");
	
	}
	 public void abs() {
		System.out.println("abs of Bmw");
	}

}
