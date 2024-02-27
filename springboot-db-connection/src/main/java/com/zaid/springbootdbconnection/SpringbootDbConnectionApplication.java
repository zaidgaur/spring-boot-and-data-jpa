package com.zaid.springbootdbconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDbConnectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootDbConnectionApplication.class, args);
		PersonRepo bean = run.getBean(PersonRepo.class);
		Person p=new Person();
		p.setName("Zaid");
		p.setAge(23);
		bean.save(p);
		
	}

}
