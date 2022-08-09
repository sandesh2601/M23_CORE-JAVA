package com.cg.finalkeyword;
class Car {
	String name;
	//final keyword is inherited but not the override
	final void print (String name) {
		System.out.println("CAR NAME IS: "+name);
	}
}
class Audi extends Car {
	
}
public class FinalInheritedMethod {

	public static void main(String[] args) {
	  
		Audi a=new Audi();
		a.print("AUDI");

	}

}
