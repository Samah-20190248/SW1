package com.mycompany.assignment2;

public class Account {
   protected double balance;
   protected static int accountNumber=0;
   ;
   public Account(){
    balance=0;
    accountNumber++; 
    
    
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    

    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + ", accountNumber=" + accountNumber + '}';
    }
    
        //put money
        public void deposit(double puttingMoney)
	{
		balance = balance + puttingMoney;
	}
        
        
          //take money
	public void withdraw(double takingMoney)
	{
            if(balance>0&&takingMoney<=balance){
             balance = balance - takingMoney;
            }
            else{
            System.out.print("ERROR..You don't have enough balance");
            }
		
	}
        
   
}
