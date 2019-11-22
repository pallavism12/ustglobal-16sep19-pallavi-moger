import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

  class Program27
  {
  	public static void main(String[] args) {
  		System.out.println("program starts");
  		ArrayList alist=new ArrayList();
  		alist.add("abc");
  		alist.add("xyz");
  		alist.add("abc");
  		alist.add("pqr");
      for(int i=0;i<alist.size();i++)
      {
        System.out.println(alist.get(i));
      }
      HashSet hs1=new HashSet(alist);
      Iterator il=hs1.iterator();
      while(il.hasNext()==true)
      {
        System.out.println(il.next());
      }
  	}
  }