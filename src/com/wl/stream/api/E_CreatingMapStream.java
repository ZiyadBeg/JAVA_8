package com.wl.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.wl.entites.Employee;

public class E_CreatingMapStream {

	public static void main(String[] args) {

		valueChangetoUpperCase();
		valueChangeToInteger();
		valueExtractFromListofListFlatMAP();

	}

	public static void valueExtractFromListofListFlatMAP() {
		/* Yeh bus list of list me se value nikalta hai */
		List<List<Integer>> number = new ArrayList<>();
		number.add(Arrays.asList(1, 2, 4));
		number.add(Arrays.asList(3, 4, 4));
		number.add(Arrays.asList(5, 6, 8));
		number.add(Arrays.asList(7, 8, 10));

		Stream<Integer> newlist = number.stream().flatMap(list -> list.stream());
		newlist.forEach(System.out::print);
	}

	public static void valueChangeToInteger() {
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		/* Changing string value to integer value */
		Stream<Integer> listOfIntegers = listOfStrings.stream().map(Integer::valueOf);
		/* Converting Stream String to list String */
		List<Integer> listConvStream = listOfIntegers.collect(Collectors.toList());
		System.out.println(listConvStream);

	}

	private static void valueChangetoUpperCase() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Zaid");
		list.add("Ziyad");
		list.add("Zaid");
		list.add("Tom");
		list.add("Diva");
		/* Yeh bus value change karegae */
		Stream<String> newStream = list.stream().map(pick -> pick.toUpperCase());
		newStream.forEach(System.out::println);
	}

}
