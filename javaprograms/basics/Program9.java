class Program9
{
	public static void main(String[] args) {
		System.out.println("program starts");
		int marks=-67;
		if(marks>=70 && marks<=100)
		{
			System.out.println("first class distinction");
		}
		else if(marks>=60 && marks<=69)
		{
			System.out.println("first class");

		}
		else if(marks>=50 && marks<=59)
		{
			System.out.println("second class");
		}
		else if(marks>=35 && marks<=49)
		{
			System.out.println("pass");
		}
		else if(marks>=0 && marks<=43)
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("invalid");
		}

		System.out.println("program ends");
		
	}
}		