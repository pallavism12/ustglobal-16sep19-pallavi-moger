package com.ustglobal.Clases;

public class Mainclass12 {
	public static void main(String[] args) {

		Student12 s1=new Student12(1,"shriya",90.0);
		Student12 s2=new Student12(2,"srajan",80.0);
		Student12 s3=new Student12(3,"aarvika",78.0);

		Student12[] stu=new Student12[3];		
		stu[0]=s1;
		stu[1]=s2;
		stu[2]=s3;

		for(Student12 i:stu) {
			System.out.println(i);
		}
		System.out.println("************");
	}
}


