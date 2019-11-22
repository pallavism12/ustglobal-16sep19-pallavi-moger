package com.ustglobal.Clases;

public class Cow5 {
	int id;
	String name;
	double cost;
	public Cow5(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public boolean equals(Object obj) {
		if(this==obj)
			return true;

		Cow5 c=(Cow5)obj;
		if(this.id==c.id)
			if(this.name.equals(c.name) )
				if(this.cost==this.cost)
					return true;
				else
					return false;
			else 
				return false;
		else 
			return false;


	}
}








