package com.zaid.basepackage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.zaid.basepackage.model.MyModel;
@Component
public interface MyRepo extends JpaRepository<MyModel, Integer>{

}
