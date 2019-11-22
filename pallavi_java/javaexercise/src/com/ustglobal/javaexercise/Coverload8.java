package com.ustglobal.javaexercise;

public class Coverload8 {
	int id;
	String name;
	
	  Coverload8(){
		this.name="pallavi";
	}
	Coverload8(int id,String name){
		this.id=id;
		this.name=name;

	}
	void display()
	{
		System.out.println("name "+name);
	}

		void display2() {
			System.out.println("id "+id);
			System.out.println("name "+ name);
		}

	}
