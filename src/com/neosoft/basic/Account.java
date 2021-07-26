package com.neosoft.basic;
public class Account{
	
	public static void main(String[] args) throws WithdrawalException {
		Account1 a =new Account1();
		System.out.println("Current Balance: "+a.balance());
		a.withdraw(20000);
		System.out.println("After Withdewal Balance: "+a.balance());
	}
}
class Account1 {
	
	private int balance = 10000; 
	public int balance() 
	{ 
		return balance; 
		
	}
	
	public void withdraw(int amount) throws WithdrawalException 
	{ 
		if (amount > balance) 
		{ 
			throw new WithdrawalException("Current balance is less than requested amount"); 
			
		} 
		balance = balance - amount; 
		
	}
}
