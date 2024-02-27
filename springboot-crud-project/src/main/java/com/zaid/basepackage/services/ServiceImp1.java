package com.zaid.basepackage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zaid.basepackage.dao.DaoInterface;
import com.zaid.basepackage.model.MyModel;
@Component
public class ServiceImp1 implements ServiceInterface {
	@Autowired
	DaoInterface daointerface;
	
	@Override
	public void save(MyModel mymodel) {
		daointerface.save(mymodel);
		
	}

	@Override
	public MyModel viewById(int id) {
		MyModel findById = daointerface.viewById(id);
		return findById;
		
	}

	@Override
	public List<MyModel> view() {
		List<MyModel> all = daointerface.view();
		return all;
	}

	@Override
	public MyModel fetchById(int id) {
		MyModel myModel = daointerface.fetchById(id);
		return myModel;
	}

	@Override
	public void update(MyModel model) {
		daointerface.update(model);
		
	}

	@Override
	public void delete(int id) {
		daointerface.delete(id);
		
	}

		
		

}
