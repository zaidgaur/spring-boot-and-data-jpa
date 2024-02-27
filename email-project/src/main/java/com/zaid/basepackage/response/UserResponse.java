package com.zaid.basepackage.response;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zaid.basepackage.request.Email;
import com.zaid.basepackage.request.UserTable;
@Component
public class UserResponse {
	private Boolean error;
	private String msg;
	private List<UserTable> user;
	private List<Email> email;
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<UserTable> getUser() {
		return user;
	}
	public void setUser(List<UserTable> user) {
		this.user = user;
	}
	public List<Email> getEmail() {
		return email;
	}
	public void setEmail(List<Email> email) {
		this.email = email;
	}
	
	

}
