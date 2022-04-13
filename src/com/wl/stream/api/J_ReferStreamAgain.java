package com.wl.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.wl.entites.Employee;

public class J_ReferStreamAgain {
	public static void main(String[] args) {
		ArrayList<Employee> employeeDetails = Employee.getEmployeeDetails();

		//callingAgainStreamError(employeeDetails);
		againCallingStreamModifiedWay(employeeDetails);
	}

	public static void againCallingStreamModifiedWay(ArrayList<Employee> employeeDetails) {
		List<Employee> collect = employeeDetails.stream().filter((emp)->emp.getName().contains("Z")).collect(Collectors.toList());
		collect.forEach(System.out::println);
		long count = collect.stream().count();
		System.out.println("Count : "+count);
	}

	public static void callingAgainStreamError(ArrayList<Employee> employeeDetails) {
		Stream<Employee> streamfilter = employeeDetails.stream().filter(emp -> emp.getName().contains("Z"));
		/* Terminal Operation */
		streamfilter.forEach(System.out::println);
		/* Terminal Operation */
		long count = streamfilter.count();
	}
}
