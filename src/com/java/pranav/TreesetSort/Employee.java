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
	public int hashCode() {
	return Objects.hash(id,name,city);
	}
	public boolean equals(Object obj) {
		
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Employee other=(Employee)obj;
		return this.id==other.id && this.name.equals(other.name) && this.city.equals(other.city);
	}
	public String toString() {
		return "Employee[name - "+name+",id - "+id+",dept - "+city+"]";
		
	}
		
	
}
