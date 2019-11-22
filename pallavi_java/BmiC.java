class BmiC
{	
	public static void main(String[] args)
	{
		double w=54;
		double h=5.3;
		double m=(w/(h*h))*10;
		
		
		System.out.println(m);
		
		
		
		if(m>=30 && m<=39.9)
		{
			System.out.println("obese range");
		}
		else if(m>=25 && m<=29.9)
		{
			System.out.println("overweight");
		}
		else if(m>=18.5 && m<=24.9)
		{
			System.out.println("healthy");
		}
		
		else if(m<18.5)
		{
			System.out.println("underwieght...");
		}
	}
}