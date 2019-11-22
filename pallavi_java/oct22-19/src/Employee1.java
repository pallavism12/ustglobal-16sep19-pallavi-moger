public class Employee1 {
	String name;
	int id;
	 public Employee1(String name,int id) {
		this.name=name;
		this.id=id;
	 }
	 void printDetails() {
		 System.out.println("emp name "+name);
		 System.out.println("emp id "+id);
		 sayHello();
	 }
	 void sayHello() {
		 System.out.println("hello "+name+" welecome");
	 }
	public static void main(String[] args) {
		Employee1 e=new Employee1("vasuki",6695);
		e.printDetails();
		
		Employee1 e1=new Employee1("vaibhav",7685);
		e1.printDetails();
	
		Employee1 e2=new Employee1("kuri",546);
		e2.printDetails();
		
	}
}

