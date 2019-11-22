class Program19
{
	public static boolean find(String s1) {
		 int len=s1.length();
		if(len%2!=0)
	{
		return true;	
	}
	else
	{
		return false;
			
	}
	}
	public static void main(String[] args) {
		String str1="hgdfy";
		boolean res=find(str1);
		System.out.println(res);
			
		
	}
}