package com.cg.operator;
//Program on Logical Operator
import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER FIRST NO");
		int a=s.nextInt();
		System.out.println("ENTER SECOND NO");
		int b=s.nextInt();
		
		boolean res=(a<b && b<10);
		boolean res1=(a<b && b>10);
		boolean res2= !(a<b);
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		s.close();
		

	}

}
