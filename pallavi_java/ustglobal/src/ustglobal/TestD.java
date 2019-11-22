package ustglobal;

public class TestD {
	public static void main(String[] args) {
		BTM b=new BTM();
		b.swipe();
		b.swipe();
		int cnt = b.getCount();
		System.out.println("count is "+cnt);
		int totalcnt = b.getTotalCount();
		System.out.println(" total count is "+ totalcnt);
		
		
		
	}
}	
 