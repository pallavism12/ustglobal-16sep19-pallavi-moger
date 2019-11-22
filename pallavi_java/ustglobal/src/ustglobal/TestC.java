package ustglobal;

public class TestC {
	public static void main(String[] args) {
		Person.sleep();
		System.out.println(Person.color="red");
	
		Person p=new Person();
		p.name="pallavi";
		p.age=22;
		System.out.println(p.name);
		System.out.println(p.age);
		p.eat();
		p.walk();
		
		Person p1=new Person();
		p1.name="pallavi";
		p1.age=22;
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.eat();
		p1.walk();
		
		
		 Fact f=new Fact();
		 long res=f.factRec(5);
		 System.out.println(res);

		

	}
}
