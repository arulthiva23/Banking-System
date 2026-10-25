package com.bank.model;

public class CheckingAccount extends BankAccount {
    private double overdraftlimit;
    
    public CheckingAccount(String accNumber, String accHolder, double initialBalance, double overdraftlimit){
        super(accNumber,accHolder, initialBalance);
        this.overdraftlimit = overdraftlimit;

    }

    @Override 
    public void Withdraw(double amount){
        if (amount>0 && Balance + overdraftlimit >= amount){
            Balance -= amount;
            System.out.println("Successfully withdrew: " + amount + "(Using Overdraft if applicable)");
        }
        else{
            System.out.println("Withdrawal denied. Exceeds balance and overdraft limit.");
        }
    }

    @Override 
    public void displayAcdetails(){
        System.out.println("Savings Ac: " + accNumber);
        System.out.println("Ac Holder: " + accHolder);
    }
}
