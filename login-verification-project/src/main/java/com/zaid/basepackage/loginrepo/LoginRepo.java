package com.zaid.basepackage.loginrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zaid.basepackage.model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

	LoginModel findByNameAndPassword(String name, String password);
;
}
