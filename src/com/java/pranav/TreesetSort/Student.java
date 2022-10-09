package com.java.pranav.TreesetSort;

import java.util.Objects;

// Natural sorting using comparable
public class Student implements Comparable<Student>{
	Integer roll;
	String name;
	

	public Student(Integer roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	

// If we want to sort by name of student
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	} 
	
//	if we want to sort by Roll NO
//	public int compareTo(Student s) {
//		return this.roll.compareTo(s.roll);
//	} 
	
	
}
	

