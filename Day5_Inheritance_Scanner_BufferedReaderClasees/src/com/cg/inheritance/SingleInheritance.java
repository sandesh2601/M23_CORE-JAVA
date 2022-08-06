 package com.cg.inheritance;
//program on single level inheritance
class Parent {
	protected int roll_no;
	void print() {
		System.out.println("HELLO");
	}
}
class Child extends Parent {
	void accept() {
		System.out.println("THE ROLL NO IS "+roll_no);
			
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.roll_no=121;
		obj.print();
		obj.accept();
	}

}
