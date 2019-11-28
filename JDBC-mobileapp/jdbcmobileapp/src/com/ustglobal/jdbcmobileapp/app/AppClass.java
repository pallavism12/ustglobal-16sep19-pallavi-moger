package com.ustglobal.jdbcmobileapp.app;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.jdbcmobileapp.dao.ContactDAO;
import com.ustglobal.jdbcmobileapp.dto.ContactBean;
import com.ustglobal.jdbcmobileapp.util.ContactManager;

public class AppClass {

	public static void main(String[] args) {

		System.out.println("press 1 to show all contacts");
		System.out.println("press 2 to search for contact using name");
		System.out.println("press 3 to operate on contact");
		System.out.println("enter your choice");

		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();

		switch(ch) {

		case 1:ContactDAO im1=ContactManager.getAContactDetails();
		List<ContactBean> result=im1.getAllNames();

		for(ContactBean bean:result) {
			System.out.println(bean.getName());
		}
		break;

		case 2:

			System.out.println("press 1 to call");
			System.out.println("press 2 to delete contact");
			System.out.println("press 3 to go back to main menu");
			System.out.println("enter your choice");

			int choice=sc.nextInt();

			switch(choice) {


			case 1:ContactDAO i1=ContactManager.getAContactDetails(); 
			String name=sc.next();



			ContactBean bean=i1.searchContact(name);
			if(bean!=null) {
				System.out.println(bean.getName());
				System.out.println(bean.getNumber());
				System.out.println(bean.getGroup_name());
			}
			System.out.println("end call");
			break;

			case 2:

				String m=sc.next();
				System.out.println(m);
				System.out.println("message sent");
				break;

			case 3:
				break;

			default:


			}

			break;

		case 3:

			System.out.println("press 1 to add contact");
			System.out.println("press 2 to delete contact");
			System.out.println("press 3 to edit contact");
			System.out.println("enter your choice.");

			int chs=sc.nextInt();
			switch(chs) {
			case 1:ContactDAO imp=ContactManager.getAContactDetails();

			ContactBean b=new ContactBean();
			b.setName(sc.next());
			b.setNumber(sc.nextInt());
			b.setGroup_name(sc.next());

			int count=imp.addContact(b);
			System.out.println(count + " inserted...");
			break;

			case 2:ContactDAO imp2=ContactManager.getAContactDetails();

			ContactBean b2=new ContactBean();
			b2.setName(sc.next());

			int count2=imp2.deleteContact(b2);
			System.out.println(count2 + "deleted..");


			break;

			case 3:ContactDAO imp3=ContactManager.getAContactDetails();

			ContactBean b3=new ContactBean();
			b3.setName(sc.next());
			b3.setNumber(sc.nextInt());
			b3.setGroup_name(sc.next());

			int count3=imp3.editContact(b3);
			System.out.println(count3 + " updated...");
			break;
			}
			break;

		}
	}

}
