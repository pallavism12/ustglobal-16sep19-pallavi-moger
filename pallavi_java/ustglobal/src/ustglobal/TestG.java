package ustglobal;

public class TestG {
	public static void main(String[] args) {
		M3g m=new M3g();
		m.call();
		m.msg();
		m.games();
		m.camera();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		M2g m1=new M2g();
		m1.call();
		m1.msg();
		m1.games();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		M1g m2=new M1g();
		m2.call();
		m2.msg();
		
		
		
	}

}
