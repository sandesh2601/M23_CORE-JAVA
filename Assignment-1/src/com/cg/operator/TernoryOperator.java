package com.cg.operator;
//Program on Ternory Operator
import java.util.Scanner;

public class TernoryOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER FIRST NO");
		int a=s.nextInt();
		System.out.println("ENTER SECOND NO");
		int b=s.nextInt();
		
		String res=(a%b==0 ?"Even":"odd");
		System.out.println(res);
		s.close();
	}

}
