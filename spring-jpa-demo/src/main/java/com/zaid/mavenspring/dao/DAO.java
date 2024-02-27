package com.zaid.mavenspring.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.zaid.mavenspring.model.UserDTO;
@Component
public class DAO {
	
	public void saveDTO(UserDTO dto){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("user");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		entityManager.close();
	}
	
	//comment

}
