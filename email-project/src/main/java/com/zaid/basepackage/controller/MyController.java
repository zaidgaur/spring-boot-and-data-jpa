package com.zaid.basepackage.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zaid.basepackage.request.Email;
import com.zaid.basepackage.request.UserTable;
import com.zaid.basepackage.response.UserResponse;
import com.zaid.basepackage.service.MyService;

@RestController
public class MyController {
	@Autowired
	MyService service;
	
	@Autowired
	UserResponse response;
	
	@PostMapping("/registration")
	public ResponseEntity<UserResponse> register(@RequestBody UserTable user){
		UserTable added = service.create(user);
		if(added!=null) {
			response.setError(false);
			response.setMsg("registration successfully");
			response.setUser(Arrays.asList(added));
			return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
		}else {
			response.setError(true);
			response.setMsg("registration failed");
			response.setUser(null);
			return new ResponseEntity<UserResponse>(response, HttpStatus.NOT_FOUND);
			
		}
		
	}
	
	@GetMapping("/login")
	public ResponseEntity<UserResponse> login(@RequestBody UserTable user){
		String name = user.getUname();
		String password = user.getUpassword();
		System.out.println(name);
		System.out.println(password);
		UserTable fetched = service.fetch(name,password);
		if(fetched!=null) {
			response.setError(false);
			response.setMsg("Login successfull");
			response.setUser(Arrays.asList(fetched));
			return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
		}else {
			response.setError(true);
			response.setMsg("Login failed please enter right credential");
			response.setUser(null);
			return new ResponseEntity<UserResponse>(response, HttpStatus.NOT_FOUND);
			 
		}
		
	}
	
	@PostMapping("/sendmail")
	public ResponseEntity<UserResponse> send(@RequestBody Email email){
		UserTable to1 = service.check(email.getTo());
		
		if(to1!=null) {
			Email sent = service.sendmail(email);	
		}else {
			email.setEmailDrafts(1);
			service.saveDraftsOne(email);
		}
		
		if(to1!=null) {
			response.setError(false);
			response.setMsg("mail sent");
			return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
		}else {
			response.setError(true);
			response.setMsg("mail not sent");
			return new ResponseEntity<UserResponse>(response, HttpStatus.NOT_FOUND);
			
		}
		
	}
	
	@GetMapping("/sent")
	public ResponseEntity<UserResponse> sent(@RequestBody Email email){
		
			List<Email> sentList = service.findMultiple(email.getFrom());
		
//		for (Email email : sentList) { //sir se puchhna ye wala 
//			System.out.println(email.getFrom());
//			
//		}
		if(sentList!=null && sentList.isEmpty()) {
			response.setError(true);
			response.setMsg("sentbox empty no mail present");
			response.setEmail(null);
			return new ResponseEntity<UserResponse>(response, HttpStatus.NOT_FOUND);
			
			
		}else {
			response.setError(false);
			response.setMsg("your sentbox mails");
			response.setEmail(sentList);
			return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
		}
		
		
	}
	
	@GetMapping("/inbox")
	public ResponseEntity<UserResponse> inbox(@RequestBody Email email){
		
		
			List<Email> recievedMail = service.findRecievedMails(email.getTo());
	
		
		if(recievedMail!=null) {
			response.setError(false);
			response.setMsg("your inbox");
			response.setEmail(recievedMail);
			return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
			
		}else {
			response.setError(true);
			response.setMsg("inbox empty");
			return new ResponseEntity<UserResponse>(response, HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("/deleteinboxmail/{id}")
	public ResponseEntity<UserResponse> deleteInboxMail(@PathVariable("id") int id){
		Email email = service.deleteinmail(id);
	
		if(email!=null) {
			response.setError(false);
			response.setMsg("this inbox mail deleted successfully");
			//response.setEmail(Arrays.asList(email));
			return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
	
		}else {
		
			response.setError(true);
			response.setMsg("inbox mail not deleted due to not present this email");
			//response.setEmail(null);
			return new ResponseEntity<UserResponse>(response, HttpStatus.NOT_FOUND);
	
		}
		
		
	}
	
	@GetMapping("/deletesentmail/{id}")
	public ResponseEntity<UserResponse> deleteSentMail(@PathVariable("id")int id){ 
		   Email deleted = service.deleteSentMail(id);
		   if(deleted!=null) {
			   response.setError(false);
			   response.setMsg("your mail from sentbox is deleted successfully");
			   response.setEmail(Arrays.asList(deleted));
			   return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
		   }else {
			   response.setError(true);
				response.setMsg("sent mail not deleted due to empty sentbox");
				response.setEmail(null);
				return new ResponseEntity<UserResponse>(response, HttpStatus.NOT_FOUND);
		   }
		
	}
	
	@GetMapping("/drafts")
	public ResponseEntity<UserResponse> getDraftsMail(@RequestBody Email email){
		List<Email> drafts = service.getDraftsEmail(email.getFrom());
		
		if(drafts!=null) {
			response.setError(false);
			response.setMsg("drafts mails fetched");
			response.setEmail(drafts);
			return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
		}else {
			response.setError(true);
			response.setMsg("sent mail not deleted due to empty sentbox");
			response.setEmail(null);
			return new ResponseEntity<UserResponse>(response, HttpStatus.NOT_FOUND);
			
		}
		
	}
	
	
	
	
	

}
