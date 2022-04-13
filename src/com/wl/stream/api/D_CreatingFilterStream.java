package com.wl.stream.api;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.wl.entites.Employee;

public class D_CreatingFilterStream {
public static void main(String[] args) {
	Employee emp=new Employee(1, "Ziyad", 500.5);
	Employee emp1=new Employee(2, "Zaid",  100.2);
	Employee emp2=new Employee(3, "Jack",  8000.05);
	
	ArrayList<Employee> empList =new ArrayList<Employee>();
	empList.add(emp);
	empList.add(emp1);
	empList.add(emp2);
	
	
	filterStreamBasedOnChar();
	System.out.println("------Stream on Object-------");
	salaryGrtThen1000(empList);
	System.out.println("------Stream on AnyMatch-------");
	anyMatch(empList);
	System.out.println("------Stream on allMatch-------");
	anyAllMatch(empList);
}

private static void anyAllMatch(ArrayList<Employee> empList) {
	boolean allMatch=empList.stream().allMatch((emplamdba)->emplamdba.getName().contains("Z"));
	System.out.println("AllMatch: "+allMatch);

	
}

private static void anyMatch(ArrayList<Employee> empList) {
	boolean anyMatch=empList.stream().anyMatch((emplamdba)->emplamdba.getName().contains("Z"));
	System.out.println("AnyMatch: "+anyMatch);
}

private static void salaryGrtThen1000(ArrayList<Employee> empList) {
	/*Salary GRT then Thousand*/
	Stream<Employee> newStream=empList.stream().filter(( emplamdba)->emplamdba.getSalary()>1000);
	newStream.forEach(System.out::println);
}

private static void filterStreamBasedOnChar() {
	ArrayList<String> list = new ArrayList<>();
	list.add("Zaid");
	list.add("Ziyad");
	list.add("Zaid");
	list.add("Tom");
	list.add("Diva");
	
	Stream<String> newStream=list.stream().filter((f)->f.contains("Z"));
	newStream.forEach(System.out::println);
}
}
