package ust_spring_live_session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${eid}")
	private int empid;
	@Value("${name}")
	private String name;
	@Value("${age}")
	private int age;
	
	@Autowired
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printEmp() {
		System.err.println(empid+" "+name+ " "+age );
		System.err.println("_______Address_________");
		System.err.println("City: "+address.getCity());
		System.err.println("Country: "+address.getCountry());
		System.err.println("zip: "+address.getZip());
	} 
}
