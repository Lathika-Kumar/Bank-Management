package com.wipro.bank.acc;

abstract class Account {
	int tenure;//Total number of Years
	float principal;
	protected float rateOfInterset;
	public void setInterest(int age,String gender) {
		if (age < 60 && gender.equalsIgnoreCase("Male")) {
			rateOfInterset = 9.8f;
		}
		else if(age>=60 && gender.equalsIgnoreCase("Male")) {
			rateOfInterset = 10.5f;
		}
		else if(age<58 && gender.equalsIgnoreCase("Female")) {
			rateOfInterset = 10.2f;
		}
		else {
			rateOfInterset = 10.8f;
		}	
	}
	public float calculateMaturityAmount(float totalprincipleDeposited, float MaturityInterset) {
		return totalprincipleDeposited + MaturityInterset;
	}
	public abstract float calculateInterest();//calculate interest
	public abstract float calculateAmountDesposited();//returns the amount the user has deposited for given tenure
}
