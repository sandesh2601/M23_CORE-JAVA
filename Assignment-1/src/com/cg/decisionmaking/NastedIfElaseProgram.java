package com.cg.decisionmaking;
//program on nasted if-else statement
public class NastedIfElaseProgram {

	public static void main(String[] args) {
		int age=18,weight=50;
		if (age>15) {
			if (weight>=40) {
				if (weight<=100) {
					System.out.println("ELIGIBLE TO DONATE THE BLOOD");
				}
				else {
					System.out.println("NOT ELIGIBLE TO DONATE THE BLOOD DUE TO OVER WEIGHT");
				}
			}
			else {
				System.out.println("NOT ELIGIBLE TO DONATE THE BLOOD");
			}
		}else {
			System.out.println("NOT ELIGIBLE TO DONATE THE BLOOD DUE TO AGE");
		}
	}

}
