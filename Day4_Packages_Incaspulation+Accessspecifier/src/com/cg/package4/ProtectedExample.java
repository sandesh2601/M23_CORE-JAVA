package com.cg.package4;

import com.cg.package4.Car;
import com.cg.package4.Mercedes;

class Car {
	//if any variable and method is protected we can access inside the child class
	protected void print() {
		System.out.println(" HEY, I AM USING ACESS SPECIFRIER");
	}
}
class Mercedes extends Car {
	//Mwecedes class is accessing the properties of car class
}
public class ProtectedExample {

	public static void main(String[] args) {
		Mercedes m = new Mercedes();
		m.print();
	}

}

