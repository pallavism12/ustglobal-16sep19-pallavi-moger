package oct23_19;

  public class Student {
	String name;
	int rollno;
	final String cname="Qspiders";
	final int  cid;
	
	Student(){
		this.cid=89;
	}
	Student(String name ,int rollno,int cid){
		this.name=name;
		this.rollno=rollno;
		this.cid=cid;
	}
	final void display() {
		System.out.println("name is:"+ name +", "+ "cname is :"+cname);
	}
	final void display(String name) {
		System.out.println("name is :" + name +","+ "cname is :" +cname);
	}
}
