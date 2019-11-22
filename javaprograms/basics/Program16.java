class Program16
{
	public static void test(int[] a1) {
		int second;
		int mid;
		int seclast;
		int sum;
		second=a1[1];
		mid=(a1.length-1)/2;
		seclast=a1.length-2;
		System.out.println(second);
		System.out.println(a1[mid]);
		System.out.println(a1[seclast]);
		sum=second+a1[mid]+a1[seclast];
		System.out.println("sum is "+sum);
		}
	public static void main(String[] args) {
		int[] a1={10,50,40,49};
		test(a1);
	}
}