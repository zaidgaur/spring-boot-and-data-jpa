package com.zaid.basepackage.services;
import java.util.List;

import com.zaid.basepackage.model.MyModel;

public interface ServiceInterface {

	public void save(MyModel mymodel);


	MyModel viewById(int id);


	public List<MyModel> view();


	public MyModel fetchById(int id);


	public void update(MyModel model);


	public void delete(int id);




	

}
