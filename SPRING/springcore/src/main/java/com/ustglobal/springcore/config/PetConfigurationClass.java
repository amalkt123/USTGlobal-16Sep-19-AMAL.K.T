package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Pet;
@Configuration
public class PetConfigurationClass {
	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	@Bean(name="pet")
	public Pet getPet() {
		Pet pet=new Pet();
		pet.setName("kumar");

		return pet;
	}
	@Bean(name="cat")
	public Cat getCat() {
		return new Cat();
	}
	@Bean(name="book")
	public Book getBook() {
		Book book=new Book();
		book.setName("venapuvu");
		book.setPrice(2000);
		return  book;
	}
	@Bean(name="Author")
	public Author getAuthor() {
		Author author= new Author();
		author.setName("kumaran ashan");
		author.setPenName("kumaran");
		
		return author;
	}

}
