package com.zaid.basepackage.dao;

import java.util.List;

import org.apache.catalina.User;

import com.zaid.basepackage.request.Email;
import com.zaid.basepackage.request.UserTable;

public interface DaoInterface {

	UserTable create(UserTable user);

	UserTable fetch(String name,String password);

	Email sendmail(Email email);

	UserTable check(String to);

	UserTable find(String Uname);

	List<Email> findMultiple(String email);

	List<Email> findRecievedMails(String email);

	Email deleteinmail(int id);

	Email deleteSentMail(int id);

	List<Email> getDraftsEmail(String from);

	void saveDraftsOne(Email email);

}
