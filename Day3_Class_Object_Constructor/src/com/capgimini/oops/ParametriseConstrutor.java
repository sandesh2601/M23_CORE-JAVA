package com.capgimini.oops;

class Pulser{
	int speed;
	String colour;
     Pulser(int speed,String colour) {
    	 speed= sp;
    	 colour=col;
	}
     void accept(){
    	 System.out.println("SPEED IS"+speed+"AND COLOUR IS "+colour);
     }
}

public class ParametriseConstrutor {

	public static void main(String[] args) {
		Pulser p=new Pulser(50, "Black");
		p.accept();

	}

}
