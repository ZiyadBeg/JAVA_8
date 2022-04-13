package com.wl.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class F_CollectStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> mapOddNumbers = valuesCollectofEvenNum();
		System.out.println("Even Number Using Mapped :"+ mapOddNumbers);
		valuesCollectedInUpperCase();
		valuesCollectEvenNumList(); 
	}

	public static void valuesCollectEvenNumList() {
		List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5, 6);
		
		List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("evenNumbers :"+ evenNumbers);
	}

	public static Map<Integer, String> valuesCollectofEvenNum() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		Map<Integer, String> mapOddNumbers = numbers.parallelStream().filter(x -> x % 2 == 0)
				.collect(Collectors.toMap(Function.identity(), x -> String.valueOf(x)));
		return mapOddNumbers;
	}

	public static void valuesCollectedInUpperCase() {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Zaid BOB");
		list.add("Ziyad");
		list.add("Zaid Avengers");
		list.add("Tom");
		list.add("Diva");

		List<String> resultList = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
		System.out.println(resultList);
	}

}
