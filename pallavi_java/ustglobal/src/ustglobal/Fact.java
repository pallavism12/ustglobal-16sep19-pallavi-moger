package ustglobal;

public class Fact {
	public long factRec(int n)
	{
		if(n==0)
			return 1;
		else
			return  n*factRec(n-1);
	}

}
