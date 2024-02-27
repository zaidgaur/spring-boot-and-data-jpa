package com.zaid.basepackage.dao;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zaid.basepackage.repo.EmailRepo;
import com.zaid.basepackage.repo.UserRepo;
import com.zaid.basepackage.request.Email;
import com.zaid.basepackage.request.UserTable;
@Component
public class DaoImpl implements DaoInterface {
	@Autowired
	UserRepo repo;
	
	@Autowired
	EmailRepo erepo;

	@Override
	public UserTable create(UserTable user) {
	    UserTable added = repo.save(user);
		return added;
	}

	@Override
	public UserTable fetch(String name,String password) {
		UserTable fetched = repo.findByUnameAndUpassword(name,password);
		return fetched;
	}

	@Override
	public Email sendmail(Email email) {
		erepo.save(email);
		Email sent = erepo.findById(email.getEid()).orElse(null);
		return sent;
	}


	@Override
	public UserTable check(String to) {
		UserTable to1 = repo.findByUname(to);
		return to1;
	}

	@Override
	public UserTable find(String uname) {
		UserTable user = repo.findByUname(uname);
		return user;
	}

	@Override
	public List<Email> findMultiple(String email) {
		List<Email> sentList = erepo.findByFromAndDeleteSentMailAndEmailDrafts(email,0,0);
		return sentList;
	}

	@Override
	public List<Email>  findRecievedMails(String email) {
		List<Email> recievedMails = erepo.findByToAndDeleteInboxMail(email,0);
		return recievedMails;
	}

	@Override
	public Email deleteinmail(int id) {
		Email inboxMail = erepo.findById(id).orElse(null);
		if(inboxMail!=null) {
		inboxMail.setDeleteInboxMail(1);
		Email email = erepo.save(inboxMail);
		 return email;
		}
		return inboxMail;
	}

	@Override
	public Email deleteSentMail(int id) {
		Email email = erepo.findById(id).orElse(null);
		if(email!=null) {
			email.setDeleteSentMail(1);
			Email deleted = erepo.save(email);
			return deleted;
		}else {
			return email;
		}
	
	}

	@Override
	public List<Email> getDraftsEmail(String from) {
		List<Email> draftMails = erepo.findByFromAndEmailDrafts(from,1);
		return draftMails;
	}

	@Override
	public void saveDraftsOne(Email email) {
		erepo.save(email);
	}
	
	
	

	

}
