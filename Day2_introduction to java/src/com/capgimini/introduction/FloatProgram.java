package com.capgimini.introduction;

import java.util.Scanner;

//program for float datatype
public class FloatProgram {

	public static void main(String[] args) {
		float a= 14;
		System.out.println(a);
		
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		float b=s.nextFloat();
		System.out.println(b);
		s.close();

	}

}
