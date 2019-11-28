package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Book;

public class BookXmlClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		Book book=context.getBean(Book.class);
		System.out.println(book.getPrice());
		System.out.println(book.getName());
		
		System.out.println("******************************");
		System.out.println(book.getAuthor().getPenName());
		System.out.println(book.getAuthor().getName());
		
	}

}
