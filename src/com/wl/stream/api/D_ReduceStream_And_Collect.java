package com.wl.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class D_ReduceStream_And_Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfAllValue();
		getLongStringReduce();
	}

	public static void sumOfAllValue() {
		/*It will return as single value only*/
		List<Integer> integers = Arrays.asList(15, 20, 15);
		Integer newIntegersValues=integers.stream().reduce(0,(num1,num2)->num1+num2);
		System.out.println("Sum : "+newIntegersValues);
	}

	public static void getLongStringReduce() {
		/*Applying in String */
		ArrayList<String> list = new ArrayList<>();
		list.add("Zaid BOB");
		list.add("Ziyad");
		list.add("Zaid Avengers");
		list.add("Tom");
		list.add("Diva");
		
		Optional<String> newlist=list.stream().reduce((list1,list2)->list1.length()>list2.length()?list1:list2);
		System.out.println("Sum : "+newlist);
	}

}
