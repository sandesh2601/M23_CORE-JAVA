package com.cg.exceptionhandling;

public class ThrowDemo {
	public static void display(int age,int weight) throws Exception {
		if(age>18 && weight>45) {
			System.out.println("ELLIGIBLE TO DONATE THE BLOOD");
		} 
		else {
			//to throw an exception explicitly
			throw new RuntimeException("EXCEPTION CAUGHT");
		}
	}

	public static void main(String[] args) throws Exception {
		try {
			display(15, 50);
		} catch (RuntimeException e) {
			System.out.println(e);
		}

	}

}
