package com.wl.JAVA8.interfaces.classes;

import java.util.Optional;

public class A_OptionalExap {
	public static void main(String[] args) {
		
		/* Keep in mind that get() method will throw NoSuchElementException in case Optional is empty.*/
		Optional<String> empty = Optional.empty();
		Optional<String> nullValue= Optional.ofNullable(null);
		//System.out.println(empty.get());
		//System.out.println(nullValue.get());
		System.out.println(nullValue.toString());
		
		
		String firstValue="Hello  ";
		String secondValue=null;
		String thirdValue="World";
		Optional<String> opfirtVal = Optional.of(firstValue);
		Optional<String> opSectVal = Optional.ofNullable(secondValue);//i know some time its come null or some value
		
		concatString(opfirtVal,opSectVal);

	}

	private static void concatString(Optional<String> opfirtVal, Optional<String> opSectVal) {
		System.out.println("Value One "+opfirtVal.isPresent());
		System.out.println("Value Two "+opSectVal.isPresent());
		String firstValue = opfirtVal.get();
		String secondValue = opSectVal.orElse(" World");
		System.out.println(firstValue+secondValue);
		
	}
}
