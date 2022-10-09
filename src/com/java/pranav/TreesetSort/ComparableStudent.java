package com.java.pranav.TreesetSort;

import java.util.TreeSet;

public class ComparableStudent {
	public static void main(String[] args) {
		Student s1=new Student(7,"aaa");
		Student s2=new Student(3,"AAA");
		Student s3=new Student(9,"ZZZ");
		Student s4=new Student(1,"KKK");
		
		TreeSet t=new TreeSet();
		
		t.add(s4);
		t.add(s2);
		t.add(s1);
		t.add(s3);
		
		System.out.println(t);
	}
}
