class Program21
{
	public static String find(String s1) {
		String s2="";
		for(int i=1;i<s1.length()-1;i++)
		{
			s2=s2+s1.charAt(i);
		}
		return s2;
	}
	public static void main(String[] args) {
		String a="asdfg";
		String s=find(a);
		System.out.println(s);
		
	}
}