package com.capgimini.oops;
// demo on how to use class and object

class Car {
	//variable
	int a;
	//user defined method
	void display() {
		System.out.println("WELCOME TO M23 BATCH");
	}
}
public class ProgramOnClassAndObject {

	public static void main(String[] args) {
		//object creation
		Car obj= new Car();
		obj.display();
		obj.a=55;
		System.out.println(obj.a);
 
	}

}
