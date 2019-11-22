
public class Employee {
	String name;
	int id;
	 public Employee(String ename,int eid) {
		name=ename;
		id=eid;
	 }
	 void printDetails() {
		 System.out.println("emp name "+name);
		 System.out.println("emp id "+id);
	 }
	public static void main(String[] args) {
		Employee e=new Employee("vasuki",6695);
		e.printDetails();
		
		Employee e1=new Employee("vaibhav",7685);
		e1.printDetails();
	
		Employee e2=new Employee("kuri",546);
		e2.printDetails();
		
	}
}
