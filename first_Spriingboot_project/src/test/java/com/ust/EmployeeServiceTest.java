package com.ust;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ust.service.EmployeeService;

@SpringBootTest
public class EmployeeServiceTest {
	@Autowired
	private EmployeeService service;
	
//	@Test
//	void getEmployeByIDTest() {
//	assertNotNull(service.getEmployeByID(102));	//validid
//	assertNull(service.getEmployeByID(10));	  //Invalid id
//	assertEquals("Suraj",service.getEmployeByID(1).getNameString());	
//	}
	
	@Test
	void saveEmployeeTest() {
		Employe employe=new Employe("kamal",20000);
		assertEquals(employe, service.saveEmployee(employe));
	}
}
