class Program22
{
	public static void main(String[] args) {
		System.out.println("program starts");
		   Object ob1=new Object();
		   Object ob2=new Object();


		   int h1=ob1.hashCode();
		   int h2=ob1.hashCode();

		   System.out.println(h1);
		   System.out.println(h2);


		   String s=ob1.toString();
		   System.out.println(s);

		   boolean b=ob1.equals(ob2);


		   System.out.println(b);




	}

}