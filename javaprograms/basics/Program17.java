  class Program17
{
	public static int[] test(int[] a1) {
		int[] b1=new int[a1.length];
		for(int index=0;index<a1.length;index++)
		{
			b1[index]=a1[index];

		}
		return b1;

	}
	public static void main(String[] args) {
		int[] a1={10,20,30,40};
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		int b1[]=test(a1);
		for(int j=0;j<b1.length;j++)
		{
			System.out.println(a1[j]);
		}

	}
}