class Program15
{
	public static void test(int[] a1) {
		int first;
		int mid;
		int last;
			first=a1[0];
			mid=(a1.length-1)/2;
			last=a1.length-1;
			System.out.println(first);
			System.out.println(a1[mid]);
			System.out.println(a1[last]);

		

	}
	public static void main(String[] args) {
		int[] a1={40,50,40,49};
		test(a1);
	}
}
		