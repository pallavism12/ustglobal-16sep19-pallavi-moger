package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

@Configuration
public class ConfigurationClass2 {
	@Bean(name="book")
	public Book getBook() {
		Book book=new Book();
		book.setName("bhavya");
		book.setPrice(100);
		return book;
	}
	
	
	@Bean(name="author")
	public Author getAuthor() {
		
		Author author=new Author();
		author.setName("ytu");
		author.setPenName("ryasy");
		return author;
	}
	

	
	
}
