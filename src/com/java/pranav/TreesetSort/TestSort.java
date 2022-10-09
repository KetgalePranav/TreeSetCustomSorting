package com.java.pranav.TreesetSort;

import java.util.Comparator;

public class TestSort implements Comparator {
	public int compare(Object obj1,Object obj2) {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
	
//		Sort By name
		return e1.name.compareTo(e2.name) ;
		// Sort By id
//		return e1.id.compareTo(e2.id);
		// Sort By city
//		return e1.city.compareTo(e2.city);
		
		// Descending Sort By name
//		return -e1.name.compareTo(e2.name) ;
		// Descending Sort By id
//		return -e1.id.compareTo(e2.id);
		// Descending Sort By city
//		return -e1.city.compareTo(e2.city);
	}
}
