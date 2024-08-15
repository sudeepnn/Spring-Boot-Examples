package com.ust;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ust.bean.HelloWord;
import com.ust.employee.Address;
import com.ust.employee.Employee;
import com.ust.service.EmployeeService;

@SpringBootApplication
public class FirstSpriingbootProjectApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(FirstSpriingbootProjectApplication.class, args);
//	EmployeeService eService=ctx.getBean(EmployeeService.class);
	
	//save employee
//	eService.saveEmployee(new Employe("Suraj",20000));
//	eService.saveEmployee(new Employe("pavan",9000));
//	eService.saveEmployee(new Employe("manoj",3000));
//	eService.saveEmployee(new Employe("Rohan",24000));
	
	//find by name
//	List<Employe> resnamEmployes=eService.getEmployeByName("manoj");
//	resnamEmployes.stream().forEach(e->System.out.println(e));
	
	//find by id
//	 Employe emp=eService.getEmployeByID(02);
//	 if(emp!=null) {
//		 System.err.println(emp);
//	 }
//	 else {
//		 System.err.println("Employee not found");
//	 }
	 
	 //find all 
//	List<Employe> list=eService.getAllEmploye();
//	list.stream().forEach(e->System.err.println(e));
	
	//update salary
	
//	System.err.println(eService.UpdateEmployeSalary(101, 90000));
	
	//delete
//	eService.deleteEmployeByID(102);
//	list=eService.getAllEmploye();
//	list.stream().forEach(e->System.err.println(e));
//		HelloWord helloWord=ctx.getBean(HelloWord.class);
//		System.err.println(helloWord.sayhello("Sudeep"));
//		
//		Employee employee=ctx.getBean(Employee.class);
//		
//		employee.printEmp();
	}

}
