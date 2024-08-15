package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.repo.UserRepo;


@Controller
public class HelloController {
	@Autowired
	private UserRepo repo;
	@RequestMapping("/hello")
	public @ResponseBody String sayHello() {
		return "Hello Spring MVC!!!";
	}
	@RequestMapping("/hi")
	public String sayHello1(Model m,@RequestParam("t1") String uname,@RequestParam("t2") String pass) {
		if(repo.validateUser(uname, pass)) {
			m.addAttribute("username",uname);
			return "welcome";
		}
		else {
			m.addAttribute("errmsg","Invalid username or password");
			return "first";
		}
	}
}
