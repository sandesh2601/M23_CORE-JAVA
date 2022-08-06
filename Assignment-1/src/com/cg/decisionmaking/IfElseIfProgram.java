package com.cg.decisionmaking;

public class IfElseIfProgram {

	public static void main(String[] args) {

		int a=10,b=7,c=25;
		if (a>b && a>c) {
			System.out.println("ALL CONDITIONS ARE TRUE");
		
		}else if (b>a || b>c) {
			System.out.println("ONE CONDITIONS ARE TRUE");
			
		}else {
			System.out.println("ALL CONDITIONS ARE FALSE");
		}
	}

}
