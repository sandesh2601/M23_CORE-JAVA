package com.cg.recursion;
//program on factorial using recursion

import java.util.Scanner;

public class Factorial1 {
	static int factorial(int a) {
		if(a==1)
			return 1;
		else
			return a*factorial(a-1);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int a=s.nextInt();
		System.out.println(factorial(a)); //function call
		s.close();
	}
    
}
