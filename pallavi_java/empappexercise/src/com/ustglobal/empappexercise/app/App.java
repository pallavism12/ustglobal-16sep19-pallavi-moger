package com.ustglobal.empappexercise.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import com.udtglobal.empappexercise.util.EmployeeManager;
import com.ustglobal.empappexercise.dao.EmployeeDAO;
import com.ustglobal.empappexercise.dto.EmployeeBean;

public class App {

	public static void main(String[] args) {
		System.out.println("press 1 to get all emp details");
		System.out.println("press 2 to insert emp details");
		System.out.println("press 3 to update emp details");
		System.out.println("press 4 to delete emp details");
		System.out.println("press 5 to search emp details");

		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();

		switch(ch) {
		case 1:EmployeeDAO impl1=EmployeeManager.getEmployeeDao();
		List<EmployeeBean> result= impl1.getAllEmployeeData();

		for(EmployeeBean bean:result) {
			System.out.println("id: "+bean.getId());
			System.out.println("name: "+bean.getName());
			System.out.println("salary: "+bean.getSal());
			System.out.println("gender: "+bean.getGender());
		}
		break;

		case 2:EmployeeDAO impl2=EmployeeManager.getEmployeeDao();
		System.out.println("enter details..");

		int id=sc.nextInt();
		String name=sc.nextLine();
		int sal=sc.nextInt();
		String gender=sc.nextLine();

		int count=impl2.insertEmployeeData(bean);
		System.out.println(count +"rows inserted");
		break;

		case 3:EmployeeDAO impl3=EmployeeManager.getEmployeeDao();
		System.out.println("enter details..");

		int id3=sc.nextInt();
		String name3=sc.nextLine();
		int sal3=sc.nextInt();
		String gender3=sc.nextLine();

		int r=impl3.updateEmployeeData(bean);
		System.out.println(count +"rows updated");
		break;

		case 4:
			EmployeeDAO impl4=EmployeeManager.getEmployeeDao();
			System.out.println("enter id");
			int id4=sc.nextInt();
			int c=impl4.deleteEmployeeData(id4);
			System.out.println(c+"deleted");
			break;

		case 5:EmployeeDAO impl5=EmployeeManager.getEmployeeDao();
		System.out.println("enter id");
		int id5=sc.nextInt();
		EmployeeBean bean=impl5.searchEmployeeData(id5);
		if(bean!=null) {
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getSal());
			System.out.println(bean.getGender());
		}
		else {
			System.out.println("no data found");
		}
		}
	}

}
