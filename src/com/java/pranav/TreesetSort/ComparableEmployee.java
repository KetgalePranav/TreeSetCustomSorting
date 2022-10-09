package com.java.pranav.TreesetSort;

import java.util.TreeSet;

public class ComparableEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee(170,"Pranav","Pune");
		Employee e2=new Employee(123,"Pratik","Kolhapur");
		Employee e3=new Employee(78,"Pramod","KGuland");
		Employee e4=new Employee(193,"Prashant","sangli");

		TreeSet t= new TreeSet(new TestSort());
		
		t.add(e4);
		t.add(e1);
		t.add(e3);
		t.add(e2);
		System.out.println(t);
	}
}
