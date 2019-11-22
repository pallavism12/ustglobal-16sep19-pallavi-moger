class Assignment10
{
	public static void main(String[] args) {
		System.out.println("program starts");

  		int x=5;
		 for(int i=1;i<=4;i++)
		 {
		 	for(int j=2;j<=i;j++)
		 	{
		 		System.out.print(" ");
		 	}
		 	for(int k=4;k>=i;k-- )
		 	{
		 	System.out.print(x) ;
		 	System.out.print(" ");
		 	x=x+5;
		    }
		    System.out.println();
		}
		System.out.println("program ends");
	}
		 
}