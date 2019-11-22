
public class Student {
	int id;
	int age;
	String name;
	String stream;
	int marks;
	
	Student(int id,int age,String name,String Stream,int marks){
	this.id=id;
	this.age=age;
	this.name=name;
	this.stream=stream;
	this.marks=marks;
	}
	
	void display() {
		
		System.out.println("id is  "+id +"age is  "+age+"name is  "+name+"stream is  "+stream+"marks is  "+marks);
	}
	public static void main(String[] args) {
		Student s1=new Student(1,18,"ranjana","cs",90);
		s1.display();	
		Student s2=new Student(2,18,"ashwini","cs",80);
		s2.display();
		Student s3=new Student(3,20,"kavitha","cs",89);
		s3.display();
		Student s4=new Student(4,21,"pallavi","cs",80);
		s4.display();
		Student s5=new Student(5,18,"pavi","cs",70);
		s5.display();	
		Student s6=new Student(6,19,"bhavya","cs",90);
		s6.display();
		Student s7=new Student(7,18,"ranjana","cs",90);
		s7.display();
		Student s8=new Student(8,18,"psm","cs",90);
		s8.display();
		Student s9=new Student(9,18,"nagu","cs",90);
		s9.display();
		Student s10=new Student(10,18,"vinu","cs",90);
		s10.display();



		
	}
	
}
