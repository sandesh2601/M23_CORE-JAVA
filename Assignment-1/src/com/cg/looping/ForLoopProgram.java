package com.cg.looping;
//program on for loop
import java.util.Scanner;

public class ForLoopProgram {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int a=s.nextInt();
		
		for(int i=1;i<a;i++) {
			System.out.print(i+" ");
			s.close();
		}
		
	}

}
