import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

  class Student
  {
  	int id;
	String name;
	double marks; 
	public Student(int id,String name,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
  	@Override
	public String toString()
	{
		return id+" "+name+" "+marks;
	}
	@Override
	public int hashCode()
	{
		return id;
	}
	@Override
	public boolean equals(Object obj)
	{
		 return this.hashCode()==obj.hashCode();
	}
}
class Program28
{
	public static void main(String[] args) {
		HashSet hs1=new HashSet();
		hs1.add(new Student(111,"abc",45));
		hs1.add(new Student(222,"pqr",49));
		hs1.add(new Student(111,"abc",48));
		Iterator il=hs1.iterator();
		while(il.hasNext()==true)
		{
			System.out.println(il.next());
		}
		

	}
}
