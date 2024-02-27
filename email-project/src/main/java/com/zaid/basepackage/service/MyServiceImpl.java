 package com.zaid.basepackage.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zaid.basepackage.dao.DaoInterface;
import com.zaid.basepackage.request.Email;
import com.zaid.basepackage.request.UserTable;
@Component
public class MyServiceImpl implements MyService {
	@Autowired
	DaoInterface dao;

	@Override
	public UserTable create(UserTable user) {
		UserTable added = dao.create(user);
		return added;
	}

	@Override
	public UserTable fetch(String name,String password) {
		UserTable fetched = dao.fetch(name,password);
		return fetched;
	}

	@Override
	public Email sendmail(Email email) {
		Email sent = dao.sendmail(email);
		return sent;
	}

	

	@Override
	public UserTable check(String to) {
		UserTable to1 = dao.check(to);
		return to1;
	}

	@Override
	public UserTable find(String uname) {
		UserTable user = dao.find(uname);
		return user;
	}

	@Override
	public List<Email> findMultiple(String email) {
		List<Email> sentList = dao.findMultiple(email);
		return sentList;
	}

	@Override
	public List<Email> findRecievedMails(String email) {
		List<Email> recievedMails = dao.findRecievedMails(email);
		return recievedMails;
	}

	@Override
	public Email deleteinmail(int id) {
		Email email = dao.deleteinmail(id);
		return email;
	}

	@Override
	public Email deleteSentMail(int id) {
		Email deleted = dao.deleteSentMail(id);
		return deleted;
	}

	@Override
	public List<Email> getDraftsEmail(String from) {
		List<Email> draftsEmail = dao.getDraftsEmail(from);
		return draftsEmail;
	}

	@Override
	public void saveDraftsOne(Email email) {
		dao.saveDraftsOne(email);
	}
	
	

}
