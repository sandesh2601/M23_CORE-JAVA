package com.capgimini.introduction;

import java.util.Scanner;

//program for char datatype
public class CharProgram {

	public static void main(String[] args) {
		// compiletime input
		char x='a';
		System.out.println("THE CHARACTER IS :"+x);
		
		//run time input
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF x :");
	
		char y=s.next().charAt(0);
		System.out.println("THE CHARACTER IS :"+y);
		s.close();
	}

}
