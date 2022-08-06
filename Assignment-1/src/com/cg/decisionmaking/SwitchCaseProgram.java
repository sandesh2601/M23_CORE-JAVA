package com.cg.decisionmaking;

import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch (a) {
		case 1:
			System.out.println("CASE:1");
			break;
		case 2:
			System.out.println("CASE:2");
			break;

		default:
			System.out.println("INVALID INPUT");
			break;
		}
		s.close();
	}

}
