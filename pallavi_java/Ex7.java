class Ex7
{
	static double circum( int r)
	{
		double res=2*3.14*r;
	
		  return res;
	}

	static boolean oddEven( int a)
	{
		  if(a%2==0)
			return true;
		else
			return false;
	}

	static long fact( int b)
	{
		long f=1;
		for(int i=1;i<=b;i++)
		{
		 	
			f=f*(i);
		}
		return f;
	}

	
	static void greet( String str)
	{
		
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		double val=circum(10);
		System.out.println(val);
		
		boolean val1=oddEven(25);
		System.out.println(val1);	
		
		long val2=fact(5);
		System.out.println(val2);	

		greet("hai Ranjana");
		
	}
}