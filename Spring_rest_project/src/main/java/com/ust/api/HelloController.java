package com.ust.api;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.bean.Employee;
import com.ust.bean.Employee_Repo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class HelloController {
	@Autowired
	private Employee_Repo repo;

//	@GetMapping("ust")
//	public  String sayHello() {
//		return "Hello ust Global";
//	}
	@GetMapping("ust")
	public  Employee sayHello() {
		return new Employee(101, "sudeep", LocalDate.of(2002, 03, 16), "sudeep2002naik@gmail.com");
	}
	
	
	@GetMapping("employees")
	public  List<Employee> sayHello1() {
		return repo.getAllEmployees();
	}
	
	
	
	
	
}
