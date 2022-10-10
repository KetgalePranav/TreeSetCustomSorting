package com.java.pranav.TreesetSort;

import java.util.Objects;

public class Employee {
	Integer id;
	String name,city;
	
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Employee() {
		super();
	}

	public String toString() {
		return "Employee[name - "+name+",id - "+id+",city - "+city+"]";
		
	}
		
	
}
