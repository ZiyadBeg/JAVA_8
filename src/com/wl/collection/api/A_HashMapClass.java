package com.wl.collection.api;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import com.wl.entites.Employee;

public class A_HashMapClass {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Ziyad", 500);
		Employee emp1 = new Employee(2, "Zaid", 100.2);
		Employee emp2 = new Employee(3, "Jack", 8000.05);
		Employee emp4 = new Employee(1, "Ziyad", 500);
		Employee emp5 = new Employee(3, "Jack", 8000.05);
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp, "one");
		map.put(emp1, "two");
		map.put(emp2, "three");
		map.put(emp4, "four");

		System.out.println("Map Size:::  " + map.size());
		
		System.out.println("Map GetElemet:::  " + map.get(emp5));
		map.forEach((k,v)->{System.out.println("OBJ:: "+k+" : "+v);});
		
		Hashtable<String, String> hash=new Hashtable<>();
	}

}
