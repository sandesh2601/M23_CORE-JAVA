
package com.cg.scannerandbuffered;
//Program for Buffered Reader
import java.io.BufferedReader;
import java.lang.Exception;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String str=b.readLine();
		System.out.println(str);
	}

}
