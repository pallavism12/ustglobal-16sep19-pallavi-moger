class Assignment15
{
	public static int[] find(int[] a1) {
		 int mid=(a1.length)/2;
		int[] b=new int[mid];
		int i=0;
		for(int index=0;index<mid;index++)
		{
			b[i]=a1[index];
			i++;
		}
		return b;

	}
	public static void main(String[] args) {
		int[] array1={10,20,30,40,70};
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