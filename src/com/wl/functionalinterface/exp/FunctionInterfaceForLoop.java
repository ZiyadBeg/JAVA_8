package com.wl.functionalinterface.exp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionInterfaceForLoop {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	
	list.add("Tom");
	list.add("Bob");
	list.add("Jack");
	list.add("Zaid");
	
	/*Using ForEach with consumer interface anonymous class*/
	list.forEach(new Consumer<String>() {
		@Override
		public void accept(String values) {
			System.out.println(values);
		}
	});
	System.out.println();
	System.out.println("Lamdba Expression");
	
	/*As u know Consumer is functional interface so we can used Lamdba expression for get the value*/
	list.forEach((String values)-> {System.out.print(values+" ,");	});
	//You can also remove datatype if lamdba contains crul brackes the you also remove it
	list.forEach((values)-> System.out.print(values+" ,"));
	
	//Calling using functional interface using method refernces 
	list.forEach(System.out::println);
}
}
