package com.cg.operator;
// Program on Bitwise Operator
import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER FIRST NO");
		int a=s.nextInt();
		System.out.println("ENTER SECOND NO");
		int b=s.nextInt();
		
		int res= a & b;  //bitwise And
		int res1=a|b;    //bitwise Or
		int res2=a^b;    //rightshift
		int res3=a<<b;   //leftshift
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		s.close();

	}

}
