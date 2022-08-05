package com.cg.package4;
import com.cg.package3.HDFC;
public class EncapsulationHDFC {

	// program on encapsulation
	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAmount(50000);
		System.out.println("THE AMOUNT IN MY BANK IS "+h.getAmount());

	}

}
