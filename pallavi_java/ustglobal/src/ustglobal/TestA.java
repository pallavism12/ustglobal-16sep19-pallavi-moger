package ustglobal;

public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost=100;
		p.color="red";
		p.brand="writo meter";
		System.out.println(p.cost);
		System.out.println(p.color);
		System.out.println(p.brand);
		p.write();
		
		System.out.println("--------------------------------------------------------------");
		
		Van v=new Van();
		v.cost=200000;
		v.color="white";
		System.out.println(v.cost);
		System.out.println(v.color);
		v.move();
		
		System.out.println("--------------------------------------------------------------");
		
		Van v1=new Van();
		v1.cost=63747345;
		v1.color="black";
		System.out.println(v1.cost);
		System.out.println(v1.color);
		v1.move();
		
		
	}
	
	

}
