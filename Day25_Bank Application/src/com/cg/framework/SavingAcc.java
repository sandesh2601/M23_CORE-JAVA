package com.cg.framework;

public abstract class SavingAcc extends BankAcc {


	private boolean isSalary;
	@SuppressWarnings("unused")
	static final private float MINBAL=0.0f;
	
	//constructor
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary=isSalary;
	}

	@Override
	public String toString() {
		return String.format("SavingAcc [isSalary=%s]", isSalary);
	}
	
	public void withdraw(float accBal) {
		System.out.println("ACCOUNT NO :"+this.getAccNo()+" ACCOUNT NAME : "+this.getAccNm()+
				" "+"ACCOUNT BAL IS: "+this.getAccBal());
	}
	
	
}
