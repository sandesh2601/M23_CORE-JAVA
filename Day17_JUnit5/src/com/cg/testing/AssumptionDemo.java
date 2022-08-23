package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	
	@Test
	void division() {
		System.setProperty("SANDESH", "SUYOG");
		//if assumption is true then printing statement is true otherwise not
		Assumptions.assumeTrue("SANDESH".equals(System.getProperty("SUYOG")));
		System.out.println("ASSUMPTION IS TRUE");
		
		//if assumption is false then printing statement is false otherwise not
		Assumptions.assumeFalse("SANDESH".equals(System.getProperty("RAJ")));
		System.out.println("ASSUMPTION IS FALSE");
	}

}
