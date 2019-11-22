package com.ustglobal.jdbcpsm.app;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.jdbcpsm.dao.EmployeeDAO;
import com.ustglobal.jdbcpsm.dto.EmployeeBean;
import com.ustglobal.jdbcpsm.util.EmployeeManager;

public class App {

	public static void main(String[] args) {

		System.out.println("press 1 to select");
		System.out.println("press 2 to insert ");
		System.out.println("press 3 to update");
		System.out.println("press 4 to delete");
		System.out.println("press 5 to search");

		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();


		switch(ch) {

		case 1: EmployeeDAO impl1= EmployeeManager.getEmployeeDAO();
		List<EmployeeBean> result =impl1.getAllEmployeeDetails( );

		for(EmployeeBean bean:result) {
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getSalary() );
			System.out.println(bean.getGender());

		}
		break;

		case 2: EmployeeDAO impl2 =EmployeeManager.getEmployeeDAO();
		EmployeeBean bean1=new EmployeeBean();

		Scanner sc2=new Scanner(System.in);
		bean1.setId(sc2.nextInt());
		bean1.setName(sc2.next());
		bean1.setSalary(sc2.nextInt());
		bean1.setGender(sc2.next());

		int res=impl2.insertEmpoyeeData(bean1);
		System.out.println(res+"rows inserted");
		break;

		case 3:EmployeeDAO impl3 =EmployeeManager.getEmployeeDAO();
		EmployeeBean bean2=new EmployeeBean();

		Scanner sc3=new Scanner(System.in);
		bean2.setId(sc3.nextInt());
		bean2.setName(sc3.next());
		bean2.setSalary(sc3.nextInt());
		bean2.setGender(sc3.next());

		int res2=impl3.insertEmpoyeeData(bean2);
		System.out.println(res2+" rows updated");


		break;

		case 4:EmployeeDAO impl4=EmployeeManager.getEmployeeDAO();

		Scanner sc4=new Scanner(System.in);
		int id4=sc4.nextInt();
		int res3=impl4.deleteEmployeeData(id4);
		System.out.println(res3+" deleted");

		case 5:EmployeeDAO impl5 =EmployeeManager.getEmployeeDAO();
		Scanner sc1=new Scanner(System.in);
		int id=sc1.nextInt();
		EmployeeBean bean=impl5.searchEmployee(id);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getSalary());
		System.out.println(bean.getGender());
		break;




		}
	}

}
