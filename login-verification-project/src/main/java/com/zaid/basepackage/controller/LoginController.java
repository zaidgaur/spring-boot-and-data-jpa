package com.zaid.basepackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zaid.basepackage.dao.LoginDao;
import com.zaid.basepackage.model.LoginModel;


@Controller
public class LoginController {
	@Autowired
	private LoginDao logindao;
	@GetMapping("/")
	public String welcome() {
		return "index";
	}
	
	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute LoginModel loginmodel,Model model ) {
	  LoginModel save = logindao.save(loginmodel);
	  model.addAttribute("save", save);
		return "registered";
	}
	
	@GetMapping("/login")
	public String login() {
		return "loginpage";
	}
	
	@PostMapping("/find")
	public String login(@RequestParam String name,@RequestParam String password,Model model) {
		LoginModel fetch = logindao.fetch(name,password);
		if(fetch!=null) {
			model.addAttribute("f", fetch);
			return "home";
		}else {
			return "invalid";
		}
	}


}
