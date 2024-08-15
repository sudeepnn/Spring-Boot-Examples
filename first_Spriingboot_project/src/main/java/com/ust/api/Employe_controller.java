package com.ust.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.Employe;
import com.ust.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class Employe_controller {
	@Autowired
	EmployeeService employeeService;
	
//	@GetMapping("/employees")
	@GetMapping
	public List<Employe> getAll(){
		return employeeService.getAllEmploye();
	}
	
	@GetMapping("/{empid}")
	@SuppressWarnings("all")
	public ResponseEntity<Employe> getEmploye(@PathVariable int empid){    //if the employee id not there still 200 status code swhcih shopudl be 404
	 Employe employe=employeeService.getEmployeByID(empid);
	 if(employe!=null)
		 return new ResponseEntity<>(employe,HttpStatus.OK);
	 else {
		 return new ResponseEntity("Employee not Found",HttpStatus.NOT_FOUND);
		
	 }
	}
	
	@PostMapping()
	public Employe createEmployee(@RequestBody Employe e) {
		employeeService.saveEmployee(e);
		return e;
	}
	
	@PutMapping
	public String UpdateEMploye(@RequestBody Employe e) {
		return employeeService.UpdateEmploye(e);
	}
	
	@DeleteMapping("/{eid}")
	public String DeleteEmploye(@PathVariable int eid) {
		return employeeService.deleteEmployeByID(eid);
	}
}
