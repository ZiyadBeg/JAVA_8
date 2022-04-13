package com.wl.collection.api;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.wl.entites.Employee;

public class E_HashMapIterating {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Ziyad", 500);
		Employee emp1 = new Employee(2, "Zaid", 100.2);
		Employee emp2 = new Employee(3, "Jack", 8000.05);
		Employee emp4 = new Employee(1, "Ziyad", 500);
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp, "one");
		map.put(emp1, "two");
		map.put(emp2, "three");
		map.put(emp4, "four");

		
		//usingIterator(map);
		//usingForLoop(map);
		//usingJava8ForEach(map);
		removeValueJava8(emp1, map);
	}

	public static void removeValueJava8(Employee emp1, Map<Employee, String> map) {
		map.keySet().removeIf(entykey->(emp1==entykey));
		map.forEach((k,v)->{System.out.println(k+"::"+v);});
	}

	public static void usingJava8ForEach(Map<Employee, String> map) {
		map.forEach((k,v)->{System.out.println(k+"::"+v);});
	}

	public static void usingForLoop(Map<Employee, String> map) {
		for(Map.Entry<Employee, String> maplist:map.entrySet()) {
			System.out.println(maplist.getKey()+" : :: "+maplist.getValue());
			
		}
	}

	public static void usingIterator(Map<Employee, String> map) {
		Set<Employee> keySet = map.keySet();
		Iterator<Employee> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Employee key = iterator.next();
			System.out.println(key + " ::: " + map.get(key));
		}
	}
}
