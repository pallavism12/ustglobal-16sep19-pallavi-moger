class Practice2
{
	public static void main(String[] args) {
		System.out.println("program starts");


		int k=2;
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(k);
				System.out.print(" ");
				k=k+2;
			}
			System.out.println();
		}
	}
}