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
			retutn false;
	}


	public static void main(String[] args)
	{
		double val=circum(10);
		System.out.println(val);
		boolean val1=oddEven(20);
		System.out.println(val1);	
		
	}
}