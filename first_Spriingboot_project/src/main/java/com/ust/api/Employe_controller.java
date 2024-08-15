package com.ust.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.Employe;
import com.ust.service.EmployeeService;

@RestController
public class Employe_controller {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employe> getAll(){
		return employeeService.getAllEmploye();
	}
}
