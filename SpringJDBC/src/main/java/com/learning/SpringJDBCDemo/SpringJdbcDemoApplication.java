package com.learning.SpringJDBCDemo;

import com.learning.SpringJDBCDemo.Repository.AlienRepo;
import com.learning.SpringJDBCDemo.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringJdbcDemoApplication.class, args);
		Alien alien1=context.getBean(Alien.class);
		alien1.setId(104);
		alien1.setName("Adithya");
		alien1.setTech("Java");
		AlienRepo repo=context.getBean(AlienRepo.class);
		repo.save(alien1);
		System.out.println(repo.findAll());
	}
}
