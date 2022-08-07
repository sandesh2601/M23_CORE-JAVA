package com.cg.recursion;

import java.util.Scanner;

public class SumOfDigit {

	
	 int add(int n) {
		 sum= n%10;
		if(n==0) {
			return 0;
		}
		else {
			return sum+add(n/10);
		}
	}
	 int sum=0;
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int n =s.nextInt();
		SumOfDigit s1=new SumOfDigit();
		int a=s1.add(n);
		System.out.println(a); //function call
		s.close();

	}

}
