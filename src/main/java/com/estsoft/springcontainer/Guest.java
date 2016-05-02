package com.estsoft.springcontainer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Guest {
	private String name;
	private List<User> users;
	
	@Autowired						// ??
	private Friend friend;
	
	public Guest(){
		this.name = "영심이";
	}

	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	
	@Override
	public String toString() {
		return "Guest [name=" + name + ", users=" + users + ", friend=" + friend + "]";
	}
	
}
