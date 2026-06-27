package com.wipro.bank.serivce;
import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;
public class BankService{

public boolean validateData(int tenure, float principal,int age,String gender) {
	try {
		if (principal >= 50 &&
			    (tenure == 5 || tenure == 10) &&
			    (gender.equalsIgnoreCase("Male") ||
			     gender.equalsIgnoreCase("Female")) &&
			    age >= 1 && age <= 100)
			{
			    return true;
			}
			else {
			    throw new BankValidationException();
			}
	}catch(BankValidationException e) {
		System.out.println(e);
	}
	return false;
	}
public void calculate(float principal,int tenure,int age,String gender){
	boolean answer = validateData(tenure, principal, age, gender);
	if (answer==true) {
		RDAccount rda = new RDAccount(tenure,principal);
        rda.setInterest(age, gender);
        float totalDeposited = rda.calculateAmountDesposited();
        float interest = rda.calculateInterest();
        float maturityAmount =rda.calculateMaturityAmount(totalDeposited, interest);
		 System.out.println("Tenure              : " + tenure + " Years");
         System.out.println("Principal (Monthly) : " + principal);
         System.out.println("Total Deposited     : " + totalDeposited);
         System.out.println("Interest Earned     : " + interest);
         System.out.println("Maturity Amount     : " + maturityAmount);
	}
}
}

