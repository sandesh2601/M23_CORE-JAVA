package com.cg.looping;

public class ForLoopPatternProgram {

	public static void main(String[] args) {
		int lines=5;
		int star=1;
		
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("@");
			}
			System.out.println();
			star++;
		}

	}

}
