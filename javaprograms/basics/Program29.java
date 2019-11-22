
import java.util.TreeSet;
import java.util.Iterator;;
class Player implements Comparable
{
	int rank;
	String name;
	String country;
	int rating;

	public Player(String name,String country,int rating)
	{
		this.name=name;
		this.country=country;
		this.rating=rating;
	}
	@Override
	public String toString()
	{
		return rank+" "+name+" "+country+" "+rating;
	}
	@Override
	public int hashCode()
	{
		return rating;
	}
	@Override
	public int compareTo(Object obj)
	{
		return obj.hashCode()-this.hashCode();
	}

}
class Program29
{
	public static void main(String[] args) {
		System.out.println("program starts");
		TreeSet t1=new TreeSet();
		t1.add(new Player("abc","ind",913));
		t1.add(new Player("def","nz",922));
		t1.add(new Player("pqr","ind",857));
		t1.add(new Player("lmn","pk",881));
		Iterator il=t1.iterator();
		int i=1;
      while(il.hasNext()==true)
      {
      	Player plr=(Player)il.next();
      	plr.rank=i;
        System.out.println(plr);
        i++;
      }

	}
}
