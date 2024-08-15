package com.ust;

import org.springframework.aot.generate.GenerationContext;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emptable")
public class Employe {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "employee_id")
	int age;
	
	String nameString;
	int salary;
	
	
	@Override
	public String toString() {
		return "Employe [age=" + age + ", nameString=" + nameString + ", salary=" + salary + "]";
	}
	public Employe() {
		
	}
	
	public Employe( String nameString, int salary) {
		super();
		this.age = age;
		this.nameString = nameString;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
