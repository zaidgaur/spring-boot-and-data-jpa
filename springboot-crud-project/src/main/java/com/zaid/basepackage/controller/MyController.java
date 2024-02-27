package com.zaid.basepackage.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zaid.basepackage.model.MyModel;
import com.zaid.basepackage.services.ServiceInterface;

import ch.qos.logback.core.model.Model;
import jakarta.annotation.PostConstruct;
//controller class
@Controller
public class MyController {
	@Autowired
	ServiceInterface serviceinterface;
	@GetMapping("/")
	public String welcome() {
		return "rsp1";
	}
	
	@GetMapping("/save")
	public ModelAndView save(@ModelAttribute MyModel mymodel) {
		serviceinterface.save(mymodel);
		return new ModelAndView("rsp2","id",mymodel);
	}
	
   @GetMapping("/oneview/{id}")         
	public ModelAndView viewById(@PathVariable int id) {
		MyModel findById = serviceinterface.viewById(id);
		return new ModelAndView("particularview","findById",findById);
	}
   
   @GetMapping("/deletestudent/{id}")
   public String delete(@PathVariable int id) {
	   serviceinterface.delete(id);
	   return "redirect:/viewall";
   }
   
   @GetMapping("/viewall")
   public ModelAndView viewAll() {
	   List<MyModel> all = serviceinterface.view();
	   return new ModelAndView("viewall","all",all);
   }
   
   
   @GetMapping("/editstudent/{id}")
   public ModelAndView fetchById(@PathVariable int id) {
	   MyModel myModel = serviceinterface.fetchById(id);
	   return new ModelAndView("edit","student",myModel);
	   
   }
   
   @GetMapping("/update")
   public String update(@ModelAttribute MyModel model) {
	   serviceinterface.update(model);
	   return "redirect:/oneview/"+model.getId();
	   
	   
   }
   
  

}
