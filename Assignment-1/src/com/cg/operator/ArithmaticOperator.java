package com.cg.operator;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER FIRST NO");
		int a=s.nextInt();
		System.out.println("ENTER SECOND NO");
		int b=s.nextInt();
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		
		System.out.println(c); 
		System.out.println(d); 
		System.out.println(e); 
		System.out.println(f); 
		
		s.close();

	}

}
