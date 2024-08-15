package ust_spring_live_session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.resources.java_config;

public class mainHandler {

	public static void main(String[] args) {
//		ApplicationContext cnt=new ClassPathXmlApplicationContext("bean.xml");
//		ApplicationContext cnt=new AnnotationConfigApplicationContext(java_config.class);
//		
//		Myclass mycl=(Myclass)cnt.getBean("Myclass.class");
////		Myclass mycl=(Myclass)cnt.getBean("hello");
//		System.err.println(mycl.myhello("sudeep"));
////		
//		Myclass m1=(Myclass)cnt.getBean("hello");
//		Myclass m2=(Myclass)cnt.getBean("hello");
//		Myclass m3=(Myclass)cnt.getBean("hello");
//		System.err.println(m1);
//		System.err.println(m2);
//		System.err.println(m3);
		
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(java_config.class);
		Employee emp=ctx.getBean(Employee.class);
		emp.printEmp();
	}

}
