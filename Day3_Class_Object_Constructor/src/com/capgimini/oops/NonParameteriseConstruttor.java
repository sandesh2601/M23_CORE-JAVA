package com.capgimini.oops;

class Animal {
	int x=15;
	
	void display() {
		System.out.println("LION"+" "+x);
	}
}
public class NonParameteriseConstruttor {


	public static void main(String[] args) {
		// 
		Animal a=new Animal();
		a.display();

	}

}
