package com.cg.operator;
//Program on Relational Operator	
import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER FIRST NO");
		int a=s.nextInt();
		System.out.println("ENTER SECOND NO");
		int b=s.nextInt();
		boolean rel=(a==b); //equality
		boolean c=(a>b);    //greaterthan 
		boolean d=(a<b);    //lessthan
		boolean e=(a<=b);   //lessthan equal to
		boolean f=(a>=b);   //greaterthan equal to
		
		System.out.println(rel);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		s.close();
	}

}
