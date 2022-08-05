package com.cg.inheritance;
//program on multi level inheritance

//parent class
class Bike {
	int speed;
	void display() {
		System.out.println("I LIKE TO DRIVE BIKE");
	}
}

//parent class for pulsar125 and child class for bike
class Pulser extends Bike {
	protected String colour;
	void print() {
		
		System.out.println("SPEED IS :"+speed);
	}
}
class Pulser125 extends Pulser {
	void accept(String colour) {
		System.out.println("COLOUR IS :"+ colour);

	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Pulser125 p=new Pulser125();
		p.print();
		p.accept("Black");
         
	}

}
