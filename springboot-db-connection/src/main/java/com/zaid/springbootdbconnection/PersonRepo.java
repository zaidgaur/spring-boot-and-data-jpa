package com.zaid.springbootdbconnection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface PersonRepo extends JpaRepository<Person, Integer>{
	

}
