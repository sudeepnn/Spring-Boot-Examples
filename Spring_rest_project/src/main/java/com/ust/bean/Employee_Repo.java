package com.ust.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

@Repository
public class Employee_Repo {
	private List<Employee> listeEmployees;
	public Employee_Repo() {
	listeEmployees=new ArrayList<Employee>();
	
	listeEmployees.add(new Employee(102, "Suraj", LocalDate.of(2005, 02, 01), "suraj@gmail.com"));
	listeEmployees.add(new Employee(103, "manav", LocalDate.of(2005, 03, 21), "manav@gmail.com"));
	listeEmployees.add(new Employee(104, "Rohan", LocalDate.of(2005, 9, 19), "Rophan@gmail.com"));
	listeEmployees.add(new Employee(105, "Komal", LocalDate.of(2005, 07, 4), "Komal@gmail.com"));
	listeEmployees.add(new Employee(106, "Manoj", LocalDate.of(2005, 06, 6), "Manoj@gmail.com"));
	listeEmployees.add(new Employee(107, "Sudheer", LocalDate.of(2006, 12, 13), "sudheer@gmail.com"));
	}
	
	public List<Employee> getAllEmployees(){
		return listeEmployees;
	}
}
