package com.estsoft.springcontainer;

import org.springframework.stereotype.Component;

@Component
public class User {
	public String name;

	public User(){
		name = "둘리";
	}
	
	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
}
