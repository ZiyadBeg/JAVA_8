package com.wl.stream.api;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_CreatingSimpleStream {
	public static void main(String[] args) {
		
		//streamWithTypeT();
		//streamWithInt();
		
		streamOfWithTypeT();
		streamOfWithInt();

		/* i will not work for float */
		
		/* float arrfloat[] = new float[] { 20.5f,30.5f,40.5f,50.2f };
		 Stream arrintStream =Stream.of(arrfloat);
        IntStream intStreamNew = arrintStream.flatMapToInt(Arrays::stream);
        intStreamNew.forEach(System.out::println);*/

	}

	private static void streamOfWithInt() {
		int intarr[] = new int[] { 20,30,40,50 };
		Stream<int[]> arrintStream = Stream.of(intarr);
		// flattenning Stream<int[]> into IntStream
        // using flatMapToInt()
        IntStream intStreamNew = arrintStream.flatMapToInt(Arrays::stream);
        intStreamNew.forEach(System.out::println);
	}

	private static void streamOfWithTypeT() {
		Stream<String> arrStream = Stream.of("JACK", "ZAID", "TOM", "BOB" );
		arrStream.forEach(System.out::println);
	}

	private static void streamWithInt() {
		int intarr[] = new int[] { 20,30,40,50 };
		IntStream arrintStream = Arrays.stream(intarr);
		arrintStream.forEach(System.out::println);
	}

	private static void streamWithTypeT() {
		String arr[] = new String[] { "JACK", "ZAID", "TOM", "BOB" };
		Stream<String> arrStream = Arrays.stream(arr);
		arrStream.forEach(System.out::println);
	}
}
