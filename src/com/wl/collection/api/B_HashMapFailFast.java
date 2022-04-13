package com.wl.collection.api;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.wl.entites.Employee;

public class B_HashMapFailFast {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Ziyad", 500);
		Employee emp1 = new Employee(2, "Zaid", 100.2);
		Employee emp2 = new Employee(3, "Jack", 8000.05);
		//Employee emp4 = new Employee(1, "Ziyad", 500);
		//Employee emp5 = new Employee(3, "Jack", 8000.05);
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp, "one");
		map.put(emp1, "two");
		map.put(emp2, "three");
		
		/*In this below example we get java.util.ConcurrentModificationException Exception */
		Set<Employee> keySet = map.keySet();
		Iterator<Employee> iterator = keySet.iterator();
	while(iterator.hasNext()) {
		Employee key = iterator.next();
		System.out.println(key+" ::: "+map.get(key));
		map.remove(key);
	}
	}
}
