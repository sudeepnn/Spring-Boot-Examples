package ust_spring_live_session;

import org.springframework.stereotype.Component;

@Component
public class Myclass {
	
	private String name;
	
	
	


	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String myhello(String name) {
		return "hello "+name;
	}

}
