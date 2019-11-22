class Assignment11
{
	public static void main(String[] args) {
		System.out.println("program starts");
		{
			for(int i=0;i<=2;i++)
			{
				for(int j=0;j<=2;j++)
				{
					if((i+j)%2==0)
					{
						System.out.print("1 ");
						
					}
					else
					{
						System.out.print("0 ");
					
					}
					
				}
				System.out.println();
			}
		}
	}
}
