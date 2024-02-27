package com.zaid.pkstddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.zaid.model.Model1;
import com.zaid.repo.RepoInterface;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zaid.model","com.zaid.repo"})
public class PkStdDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PkStdDemoApplication.class, args);
		RepoInterface repoInterface = context.getBean(RepoInterface.class);
		Model1 model1 = new Model1();
		model1.setName("Mohd Zaid");
		model1.setRollNumber("18DCE8038");
		model1.setMarks("99%");
		repoInterface.save(model1);
	}

}
