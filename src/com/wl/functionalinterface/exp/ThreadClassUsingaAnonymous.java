package com.wl.functionalinterface.exp;

public class ThreadClassUsingaAnonymous {

	public static void main(String[] args) {
	//Creating Thread using Anonymous class.
		//anonymousClasssThreadCreating();
		lamdbaExpressionThreadCreating();

	}

	private static void lamdbaExpressionThreadCreating() {
		
		Runnable run=()-> {	System.out.println("First Thread Has been Created");};
		Thread t=new Thread(run);
		t.start();
		

}
	private static void anonymousClasssThreadCreating() {
		Runnable run=new Runnable() {
			@Override
			public void run() {
				System.out.println("First Thread Has been Created");
			}
		};
		
		Thread t=new Thread(run);
		t.start();
	}

}
