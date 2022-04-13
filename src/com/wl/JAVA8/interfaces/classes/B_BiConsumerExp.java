package com.wl.JAVA8.interfaces.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import com.wl.entites.Employee;

public class B_BiConsumerExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*This will print 30*/
		BiConsumer<Integer, Integer> biConsumer=(x,y)->System.out.println(x+y);
		biConsumer.accept(10,20);
		
		
		Employee emp = new Employee(1, "Ziyad", 500);
		Employee emp1 = new Employee(2, "Zaid", 100.2);
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp, "one");
		map.put(emp1, "two");
		map.forEach((k,v)->{System.out.println(k+"::"+v);});
		

	}

}
