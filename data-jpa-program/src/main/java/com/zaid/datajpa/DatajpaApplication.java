package com.zaid.datajpa;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DatajpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DatajpaApplication.class, args);
		ForRepoUse repoUse = context.getBean(ForRepoUse.class);
		ForTable forTable = new ForTable();
//		forTable.setName("MohdZaid");
//		forTable.setSalary(50000);
//		forTable.setDesignation("Backend Developer");
//		repoUse.save(forTable);
		
//		ForTable id = repoUse.findById(1).orElse(null);
//		System.out.println(id.getName());
//	    System.out.println(id.getSalary());
//	    System.out.println(id.getDesignation());
//	    
//	    ForTable id2 = repoUse.findById(1).orElse(null);
//	    id2.setName("zaid");
//	    id2.setSalary(35000);
//	    id2.setDesignation("FullStack Developer");
//	    repoUse.save(id2);
		
		ForTable findById = repoUse.findById(1).orElse(null);
		repoUse.deleteById(1);
	    
		
		
		
		
		
		
	}
	

}
