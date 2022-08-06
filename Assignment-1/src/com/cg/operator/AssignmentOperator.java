package com.cg.operator;
// Program on Assignment Operator
import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER FIRST NO");
		int a=s.nextInt();
		System.out.println("ENTER SECOND NO");
		int b=s.nextInt();
		
		System.out.println(a+=b); //addition of assignment
		System.out.println(a-=b); //subtraction of assignment
		System.out.println(a*=b); // multiplication of assignment
		System.out.println(a/=b); //division of assignment
		
		s.close();

	}

}
