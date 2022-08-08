package com.capgimini.introduction;

import java.util.Scanner;

//program for string datatype
public class StringProgram {

	public static void main(String[] args) {
       String st="ABC";
       System.out.println(st);
		Scanner s= new Scanner(System.in);
        // next() will take only first word and
        // nextline() will taken entire string
        System.out.println("ENTER STRING");
        String str=s.next();
        System.out.println(str);
        s.close();
    
	}

}
