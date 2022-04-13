package com.wl.stream.api;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class C_OperationOnStreams {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Zaid");
		list.add("Ziyad");
		list.add("Zaid");
		list.add("Tom");
		list.add("Diva");

		//intermiateOrTermianlStreamExp(list);
		streamAnyMatch(list);
		
		
		
	}

	private static void streamAnyMatch(ArrayList<String> list) {
		Boolean checked=	list.stream().anyMatch((String s)->s.contains("z"));
		
			/*Below one is also validate*/
		Boolean checked2=list.stream().anyMatch(s->s.toLowerCase().contains("z"));
		System.out.println(checked+"---------"+checked2);
	}

	private static void intermiateOrTermianlStreamExp(ArrayList<String> list) {
		/* Using intermiate n terminal streams */
		/*Intermediate Stream */
		Stream<String> stream = list.stream();
		/*Intermediate Stream */
		Stream<String> streamDis = stream.distinct();
		/*terminal streams*/
		long count = streamDis.count();
		System.out.println("Output:: "+count);
		
		/*In one line*/
	System.out.println(list.stream().distinct().count());
	
	/*Error once the stream has been used you cannot used it again*/
	System.out.println(streamDis.count());
	}

}
