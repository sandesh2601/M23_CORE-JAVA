package com.cg.recursion;

import java.util.Scanner;

//program on fibonacci using recursion
public class Fibonacci {

	static int fibonacci(int a) {
		if(a<=1) {
			return a;
		}
		else {
			return fibonacci(a-1)+fibonacci(a-2);
		}
			
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int a=s.nextInt();
		System.out.println(fibonacci(a)); //function call
		s.close();

	}

}
