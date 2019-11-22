package ustglobal;

public class TestB {
	public static void main(String[] args) {
		Cow c=new Cow();
		
			c.color="white";
			c.name="gowri";
			System.out.println(c.color);
			System.out.println(c.name);
			c.eat();
			c.sleep();
			
			System.out.println("************************************");
			
			c.color="brown";
			c.name="mangala";
			System.out.println(c.color);
			System.out.println(c.name);
			c.eat();
			c.sleep();
			
		
	}

}
