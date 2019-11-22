class Program11
{
	public static boolean sum(int a,int b) 
	{
		int sum;
		sum=a+b;
		if(sum>50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		boolean res;
		res=sum(78,38);
		System.out.println(res);
	}
}