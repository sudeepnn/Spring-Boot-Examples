package com.ust.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloWord {
	public String sayhello(String name) {
		return "Heloo"+name;
	}
}
