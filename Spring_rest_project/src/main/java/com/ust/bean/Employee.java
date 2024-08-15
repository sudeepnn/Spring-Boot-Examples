package com.ust.bean;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;


public class Employee {
	private int emlid;
	private String name;
	@JsonFormat(pattern = "dd-MMM-yyyy")
	private LocalDate dobDate;
	private String email;
	public Employee(int emlid, String name, LocalDate dobDate, String email) {
		super();
		this.emlid = emlid;
		this.name = name;
		this.dobDate = dobDate;
		this.email = email;
	}
	public int getEmlid() {
		return emlid;
	}
	public void setEmlid(int emlid) {
		this.emlid = emlid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDobDate() {
		return dobDate;
	}
	public void setDobDate(LocalDate dobDate) {
		this.dobDate = dobDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
