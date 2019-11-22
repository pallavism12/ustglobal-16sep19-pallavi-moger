class Assignment13
{
	public static boolean find(int[] a1) {
		int last=a1.length-1;
		 int first=a1[0];
		 if(first==a1[last])
		 {
		 	return true;
		 }
		 else
		 {
		 	return false;
		 }

		
	}
	public static void main(String[] args) {
		int[] array={10,20,30,40};
		boolean res=find(array);
		System.out.println(res);
		
		
	}
}