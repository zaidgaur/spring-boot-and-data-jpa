package com.zaid.basepackage.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class LoginModel {
	@Id
	@GeneratedValue(generator = "auto")
	@GenericGenerator(name="auto",strategy="increment")
	private int id;
	private String name;
	private String password;
	private String mail;
	private long salary;
	@Column(name="account_non_nocked")
	private boolean accountNonLocked;
	@Column(name="failed_attempt")
	private int failedAttempt;
	@Column(name="lock_time")
	private int lockTime;
	
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}
	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}
	public int getFailedAttempt() {
		return failedAttempt;
	}
	public void setFailedAttempt(int failedAttempt) {
		this.failedAttempt = failedAttempt;
	}
	public int getLockTime() {
		return lockTime;
	}
	public void setLockTime(int lockTime) {
		this.lockTime = lockTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	

}
