class Assignment16
{
	public static double find(int[] a1) {
		 
		double sum=0.0;
		double avg=0.0;
		int count=0;
		
		for(int index=0;index<a1.length;index=index+2)
		{
			
			sum=sum+a1[index];
			count++;
			
		}
		avg=sum/count;
		return avg;



	}
	public static void main(String[] args) {
		int[] array={10,20,30,40,50,60,10};
		double res=find(array);
		System.out.println(res);

		
	}
}