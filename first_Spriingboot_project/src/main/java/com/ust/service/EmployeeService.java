package com.ust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.Employe;
import com.ust.repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public void saveEmployee(Employe emp) {
		repo.saveAndFlush(emp);
		System.err.println("Employee saved");
	}
	
	public List<Employe> getAllEmploye(){
		return repo.findAll();
	}
	
	public Employe getEmployeByID(int id) {
		Optional<Employe> op= repo.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		else 
			return null;
	}
	public List<Employe> getEmployeByName(String name) {
		return repo.findByNameString(name);
	
	}
	
	public void deleteEmployeByID(int id) {
		Optional<Employe> op= repo.findById(id);
		if(op.isPresent()) {
			repo.deleteById(id);
			System.err.println("Employee Deleted Successfully");
		}
		else 
			System.err.println("Employee Not found");
	}
	
	public String UpdateEmployeSalary(int id,int newsalary) {
		Employe employe=getEmployeByID(id);
		if(employe!=null) {
			employe.setSalary(newsalary);
			repo.saveAndFlush(employe);
			return "Employe salary updated";
		}
		else {
			return "Employe Not Found";
		}
		
	}
	

}
