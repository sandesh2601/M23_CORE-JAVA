package com.cg.decisionmaking;
//program on continue
public class ContinueProgram {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;   //skip 5
			}
			System.out.println(i);
		}

	}

}
