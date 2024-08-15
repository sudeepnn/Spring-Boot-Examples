package com.ust.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.Employe;


public interface EmployeeRepository extends JpaRepository<Employe, Integer> {
	
	public List<Employe> findByNameString(String nameString);

}
