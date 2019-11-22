class Program20
{
	public static String find(String s1) {
		String s2="";
		int mid=(s1.length()-1)/2;
		for(int index=0;index<=mid;index++){
               s2=s2+s1.charAt(index);
		}
		return s2;

	}
	public static void main(String[] args) {
		String a="abcd";
		String res=find(a);
		System.out.println(res);
	}
}