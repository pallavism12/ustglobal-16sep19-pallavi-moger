class Program13
{
	public static void main(String[] args) 
	{
		int [] marks=new int[4];
		double sum=0.0;
		double avg=0.0;
		marks[0]=45;
		marks[1]=47;
		marks[2]=54;
		marks[3]=45;

   		
		for(int i=0;i<=3;i++)
		{
			 sum=sum+marks[i];
			 
		}
		avg=sum/4;
		System.out.println(avg);

	}
}
	