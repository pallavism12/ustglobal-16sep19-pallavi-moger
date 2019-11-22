import java.util.ArrayList;
class Shoes
{
	int size;
	String colour;
	String brand; 
	double price;

	public Shoes(int size,String colour,String brand, double price)
	{
		this.size=size;
		this.colour=colour;
		this.brand=brand;
		this.price=price;

	}

	public String toString()
	{
		return size+" "+colour+" "+brand+" "+price;
	}

}
class Mobile
{
	int ram;
	String colour;
	String brand; 
	double price;
	String model;

	public Mobile(int ram,String colour,String brand, double price,String model)
	{
		this.ram=ram;
		this.colour=colour;
		this.brand=brand;
		this.price=price;
		this.model=model;

	}

	public String toString()
	{
		return ram+" "+colour+" "+brand+" "+price+" "+model;
	}

}
class Program25
{
	public static void showCart(ArrayList cart) 
	{
		for(int i=0;i<cart.size();i++)
		{
			System.out.println(cart.get(i));
		}
		

	}
	public static void main(String[] args) 
	{
		Shoes s1=new Shoes(12,"black","redmi",15000);
		Mobile m1=new Mobile(16,"white","redmi",30000,"note pro");
		  ArrayList cart=new ArrayList();
		  cart.add(s1);
		  cart.add(m1);
		  showCart(cart);


	}
}