package com.zaid.basepackage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zaid.basepackage.request.UserTable;

public interface UserRepo extends JpaRepository<UserTable, Integer> {


	UserTable findByUnameAndUpassword(String name, String password);


	UserTable findByUname(String to);



}
