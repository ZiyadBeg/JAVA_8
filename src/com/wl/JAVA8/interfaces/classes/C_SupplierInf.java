package com.wl.JAVA8.interfaces.classes;

import java.util.Random;
import java.util.function.Supplier;

public class C_SupplierInf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> sup = C_SupplierInf::getRandomNum;
		Supplier<Double> sup1 = Math::random;
		
		System.out.println(sup.get());
		System.out.println(sup1.get());

	}

	/**
	 * 
	 */
	private static Integer getRandomNum() {
		Random ran = new Random();
		return ran.nextInt(100);
	}

}
