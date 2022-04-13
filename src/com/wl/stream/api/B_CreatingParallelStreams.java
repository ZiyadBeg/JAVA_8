package com.wl.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author a788850
 *
 */
public class B_CreatingParallelStreams {

	public static void main(String[] args) {
		List<Integer> listInt = Arrays.asList(5, 8, 482, 84, 1);
		Stream<Integer> newStream = listInt.stream();
		newStream.forEach((num)->{System.out.println(num+" ,"+ Thread.currentThread().getName());});
		System.out.println();
		System.out.println("-----------Let execute with Parallel Stream-----------");
		
		List<Integer> listInt2 = Arrays.asList(5, 8, 482, 84, 1);
		Stream<Integer> newStream2 = listInt2.parallelStream();
		newStream2.forEach((num)->{System.out.println(num+" ,"+ Thread.currentThread().getName());});
	}

}
