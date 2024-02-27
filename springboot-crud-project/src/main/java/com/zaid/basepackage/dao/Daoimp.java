package com.zaid.basepackage.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zaid.basepackage.model.MyModel;
import com.zaid.basepackage.repo.MyRepo;

@Component
public class Daoimp implements DaoInterface{
	@Autowired
	MyRepo myrepo;
	public void save(MyModel mymodel) {
		myrepo.save(mymodel);
	}
	@Override
	public MyModel viewById(int id) {
		MyModel findById =  myrepo.findById(id).orElse(null);
		return findById;
		
	}
	@Override
	public List<MyModel> view() {
		List<MyModel> all = myrepo.findAll();
		return all;
	}
	@Override
	public MyModel fetchById(int id) {
		MyModel myModel = myrepo.findById(id).orElse(null);
		return myModel; 
	}
	@Override
	public void update(MyModel model) {
		myrepo.save(model);
		
	}
	
	@Override
	public void delete(int id) {
	 myrepo.deleteById(id);	
		
	}

}
