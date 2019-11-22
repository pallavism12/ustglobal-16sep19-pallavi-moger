package com.ustglobal.empapp;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;


public class App {
	public static void main(String[] args) {
		System.out.println("press 1 to get all emp details");
		System.out.println("press 2 to insert emp data");
		System.out.println("press 3 to update emp data");
		System.out.println("press 4 to delete emp data");
		System.out.println("press 5 to searh single emp data");

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();

		switch(ch) {
		case 1:
			EmployeeDAO impl1=EmployeeManager.getEmployeeDAO();
			List<EmployeeBean>  result= impl1.getAllEmployeeData();

			for(EmployeeBean bean :result) {
				System.out.println("id"+bean.getId());
				System.out.println("name"+bean.getName());
				System.out.println("sal"+bean.getSal());
				System.out.println("gender"+bean.getGender());

			}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			EmployeeDAO impl5=EmployeeManager.getEmployeeDAO();
			System.out.println("enter id");
			int id5=sc.nextInt();
			EmployeeBean bean= impl5.searchEmployeeData(id5);
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

			
		}//end of main
	}//end of class

