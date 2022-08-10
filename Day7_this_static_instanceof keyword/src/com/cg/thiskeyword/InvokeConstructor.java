package com.cg.thiskeyword;
//this() to invoke cureent class constructor
class Z {
	public int x;
	//default constructor
	Z() {
		this(23); //invoking the parametrized constructor
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	//parametrized constructor
	Z(int x) {
		System.out.println("VALUE IS: "+x);
	}
	
}
public class InvokeConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Z z=new Z();

	}

}
