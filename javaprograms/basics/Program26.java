import java.util.HashSet;
import java.util.Iterator;
  class Program26
  {
  	public static void main(String[] args) {
  		System.out.println("program starts");
  		HashSet hs1=new HashSet();
  		hs1.add("abc");
  		hs1.add("xyz");
  		hs1.add("abc");
  		hs1.add("pqr");
      Iterator il=hs1.iterator();
      while(il.hasNext()==true)
      {
        System.out.println(il.next());
      }
  	}
  }