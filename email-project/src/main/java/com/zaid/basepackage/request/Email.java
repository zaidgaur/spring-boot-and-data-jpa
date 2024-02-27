package com.zaid.basepackage.request;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Email {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	private String subject;
	private String body;
	@Column(name="sender")
	private String from;
	@Column(name="reciever")
	private String to;
	@JsonIgnore
	private int deleteInboxMail;
	@JsonIgnore
	private int deleteSentMail;
	@JsonIgnore
	private int emailDrafts;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getDeleteInboxMail() {
		return deleteInboxMail;
	}
	public void setDeleteInboxMail(int deleteInboxMail) {
		this.deleteInboxMail = deleteInboxMail;
	}
	public int getDeleteSentMail() {
		return deleteSentMail;
	}
	public void setDeleteSentMail(int deleteSentMail) {
		this.deleteSentMail = deleteSentMail;
	}
	public int getEmailDrafts() {
		return emailDrafts;
	}
	public void setEmailDrafts(int emailDrafts) {
		this.emailDrafts = emailDrafts;
	}
	
	
	

}
