package com.capgimini.oops;
//demo on how to use class and object

import java.util.Scanner;

class Vehicle{
	//variable
		int a;
		//user defined method
		void display() {
			System.out.println("WELCOME TO M23 BATCH");
		}
}
public class RunTimeclassAndObject {

	public static void main(String[] args) {
	
		Vehicle obj=new Vehicle();
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF A");	
		obj.a=s.nextInt();
		
		//accessing the class vehicle method
		obj.display();
		//accessing the class vehicle variable
		System.out.println(obj.a);
		s.close();

	}

}
