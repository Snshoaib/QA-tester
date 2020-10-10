package com.usa.smarttech;

public class ChekingAccount extends SavingAccount {

	protected void chekingDetails() {
	SavingAccount.Initialbalance = 2000.99;
	SavingAccount.deposit = 100;
	SavingAccount.withdraw = 300.75;
	SavingAccount.blance = SavingAccount.Initialbalance + SavingAccount.deposit - SavingAccount.withdraw;
	System.out.println("Customer total checking account money : " + SavingAccount.blance);

	}



	}
