package com.addistutor.SpringbootMockitotesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.addistutor.SpringbootMockitotesting.dao.UserRepository;
import com.addistutor.SpringbootMockitotesting.model.User;
 
@SpringBootApplication
public class SpringBootMockitoTestingApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository repository;
	//private UserService user;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMockitoTestingApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		//  
		repository.deleteAll();

	    // save a couple of users
	    //repository.save(new User("Alice", 32,"Smith"));
 	     repository.save(new User("Bob", 23,"Denver"));
	     repository.save(new User("Haile", 32,"Addis Ababa"));
	     
	    // fetch all users
	     
	    System.out.println("User found with findAll():");
	    System.out.println("-------------------------------");
	    for (User u : repository.findAll()) {
	      System.out.println(u.toString());
	    }
	    System.out.println();

	    // fetch an individual customer
	    System.out.println("users found with address('Denver'):");
	    System.out.println("--------------------------------");
	    System.out.println(repository.findByAddress("Denver"));

	    //System.out.println("users found with findByLastName('xx'):");
	    //System.out.println("--------------------------------");
	     
		
	}
		

}
