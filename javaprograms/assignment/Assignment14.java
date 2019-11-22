class Assignment14
{
	public static int[] find(int[] a1) {
		 int j=a1.length-2;
		int[] b1=new int[j];
		int i=0;
		for(int index=1;index<a1.length-1;index++)
		{
			b1[i]=a1[index];
			i++;
		}
		return b1;

	}
	public static void main(String[] args) {
		int[] array1={10,20,30,40};
		System.out.println("array1 elements are");
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
		 int[] array2=find(array1);
		 System.out.println("array2 elements are");
		 for(int j=0;j<array2.length;j++)
		{
			System.out.println(array2[j]);
		}


	}
}