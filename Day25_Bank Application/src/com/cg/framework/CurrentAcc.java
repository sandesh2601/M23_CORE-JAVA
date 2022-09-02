package com.cg.framework;

public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit;

	//constructor
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	
	public void withdraw(float accBal) {
		System.out.println("ACCOUNT NO :"+this.getAccNo()+" ACCOUNT NAME : "+this.getAccNm()+
				" "+"ACCOUNT BAL IS: "+(accBal+creditLimit));
	}
	
	

}
