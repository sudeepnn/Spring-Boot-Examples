package com.repo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {
	Map<String, String> users;

	public UserRepo() {
		users = new HashMap<>();
		users.put("sudeep", "qwerty");
		users.put("suraj", "hello");
		users.put("manav", "asd123");
		users.put("rohan", "rohan123");
		users.put("komal", "abcd123");
	}
	
	public boolean validateUser(String user,String pass) {
		if(users.containsKey(user) && users.get(user).equals(pass)) {
			return true;
		}
		return false;
	}
	
	
}
