package com.wl.stream.api;

import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class G_InfiniteStream {
	private static long getCurrentTime() {
		return System.currentTimeMillis();
	}

	public static void main(String[] args) {
		/* First It will print the first Args then it will print based on functions */
		printingForLoopIncrement();
		printTimeUsingGenerateStream();
		Supplier<UUID> supUUID = UUID::randomUUID;
		InfiniteWithCustomType(supUUID);
	
		
	}

	public static void InfiniteWithCustomType(Supplier<UUID> supUUID) {
		Stream<UUID> generate = Stream.generate(supUUID);
		/*We use a skip() transformation to discard first 10 results and take the next 10 elements.*/
		Stream<UUID> limit = generate.skip(10).limit(10);
		limit.forEach(System.out::println);
	}

	public static void printTimeUsingGenerateStream() {
		Stream<Long> stlong = Stream.generate(G_InfiniteStream::getCurrentTime);
		stlong.limit(5).forEach(System.out::println);
	}

	public static void printingForLoopIncrement() {
		int j=0;
		while(j<5) {
			System.out.println(j+1+":: Increment by 1");
		j++;
		}
		
		/*Converting Above while loop in stream*/
		Stream<Integer> intStream = Stream.iterate(1, i -> i +1);
		intStream.limit(5).forEach(System.out::println);
	}

}
