package com.wipro.bank.acc;
public class RDAccount extends Account {

    public RDAccount(int tenure, float principal) {
        this.tenure = tenure;
        this.principal = principal;
    }

    @Override
	public float calculateInterest() {
    	float p=principal;//principle
		float r=rateOfInterset/100;//rate of interest/100
    	float n=4;//4(no of quarter years)
    	float t=60/12;//no of months remaining
    	return (float)(p*(Math.pow((1+r/n), n*t)-1));
    	
    }

    @Override
    public float calculateAmountDesposited() {
        return principal * 12 * tenure; 
    }
}