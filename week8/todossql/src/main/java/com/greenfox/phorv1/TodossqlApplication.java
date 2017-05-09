package com.greenfox.phorv1;

import com.greenfox.phorv1.model.Todo;
import com.greenfox.phorv1.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodossqlApplication implements CommandLineRunner{

	@Autowired
	TodoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TodossqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Todo("Start the day"));
		repository.save(new Todo("Finish H2 workshop1"));
		repository.save(new Todo("Finish JPA workshop2"));
		repository.save(new Todo("Create a CRUD project"));
		repository.save(new Todo("I have to learn Object Relational Mapping"));
	}
}
