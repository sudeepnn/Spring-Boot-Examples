package com.ust;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


import com.ust.repo.EmployeeRepository;
import com.ust.service.EmployeeService;

@SpringBootTest
public class Employeeservice_mockito {
	
	@Mock
	private EmployeeRepository repository;
	
	@InjectMocks
	private EmployeeService service;
	
	@Test
    void getEmployeByIDTest() {
        
        when(repository.findById(102)).thenReturn(Optional.of(new Employe("sudeep",50000)));
        when(repository.findById(1)).thenReturn(Optional.of(new Employe("Suraj",5000)));
        when(repository.findById(10)).thenReturn(Optional.empty());

        
        assertNotNull(service.getEmployeByID(102));	
        assertEquals("John Doe", service.getEmployeByID(102).getNameString());

        
        assertNull(service.getEmployeByID(10));	  

        
        assertEquals("Suraj", service.getEmployeByID(1).getNameString());

        
        verify(repository, times(1)).findById(102);
        verify(repository, times(1)).findById(1);
        verify(repository, times(1)).findById(10);
    }

}
