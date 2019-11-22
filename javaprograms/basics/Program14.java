class Program14
{
	public static void findAvg(int[] marks) {
		double sum=0.0;
		double avg=0.0;
		for(int i=0;i<marks.length;i++)
		{
            sum=sum+marks[i];
		}
		avg=sum/marks.length;
		System.out.println("avg is: "+avg);		
	}
	public static void main(String[] args) 
	{
		int[] javamarks={10,39,49,78};
		int[] sqlmarks={30,40,70,89};
		findAvg(javamarks);
		findAvg(sqlmarks);
	}	
}	
