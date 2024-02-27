package com.zaid.basepackage.dao;

import java.util.List;

import com.zaid.basepackage.model.MyModel;


public interface DaoInterface {
    
	public void save(MyModel mymodel);

	public MyModel viewById(int id);

	public List<MyModel> view();

	public MyModel fetchById(int id);

	public void update(MyModel model);

	public void delete(int id);

}
