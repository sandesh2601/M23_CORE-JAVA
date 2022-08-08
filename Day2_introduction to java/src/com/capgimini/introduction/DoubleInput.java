package com.capgimini.introduction;

import java.util.Scanner;

//program for double datatype
public class DoubleInput {

	public static void main(String[] args) {
		double a= 10000.254321;
		System.out.println(a);
		
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		double b= s.nextDouble();
		System.out.println(b);
		s.close();

	}

}
