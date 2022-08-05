package com.cg.inheritance;
// program on Hireachical Inheritance
class AndroidVersion{
	void display() {
		System.out.println("ANDROID VERSION");
	}
}
class KitKat extends AndroidVersion{
	void print() {
		System.out.println("KITKAT VERSION");
	}
	
}
class Pie extends AndroidVersion {
	void print1() {
		System.out.println("PIE VERSION");
	}
	
}
public class HireaechicalInheritance {

	public static void main(String[] args) {
		KitKat k= new KitKat();
		Pie p= new Pie();
		k.display();
		k.print();
		p.print1();
		

	}

}
