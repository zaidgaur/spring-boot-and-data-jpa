		package com.zaid.mavenspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zaid.mavenspring.dao.DAO;
import com.zaid.mavenspring.model.UserDTO;

//@RequestMapping("/")
//@Component
@Controller
public class MyController {
	@Autowired
	private DAO dao;
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String userName, @RequestParam String password) {
		if (password.equals("azam1234")) {
			return new ModelAndView("response1", "msg", "login successful mr: " + userName);
		}
		return new ModelAndView("response1", "msg", "login failed mr: " + userName);
	}

	@RequestMapping("/registration")
	public ModelAndView registration(@ModelAttribute UserDTO dto) {
		dao.saveDTO(dto);
		return new ModelAndView("response2", "user", dto);
	}

	@RequestMapping("/listUser")
	public ModelAndView listUser() {
		UserDTO dto1 = new UserDTO();
		dto1.setUserName("Mr.Zaid");
		UserDTO dto2 = new UserDTO();
		dto2.setUserName("Mr.Arun");
		UserDTO dto3 = new UserDTO();
		dto3.setUserName("Mr.Jhonny");
		List<UserDTO> list=new ArrayList<UserDTO>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		
		return new ModelAndView("rsp3", "userlist", list);
	}

}
