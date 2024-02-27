package com.zaid.basepackage.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zaid.basepackage.loginrepo.LoginRepo;
import com.zaid.basepackage.model.LoginModel;

@Component
public class LoginDao {

	@Autowired
	private LoginRepo loginrepo;

	public LoginModel save(LoginModel loginmodel) {
		LoginModel save = loginrepo.save(loginmodel);
		return save;
 
	}


	public LoginModel fetch(String name, String password) {
		LoginModel model = loginrepo.findByNameAndPassword(name,password);
		return model;
		
		
	}

}
