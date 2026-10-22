package com.bank.model;

public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(String accNumber, String accHolder, double intialBalance, double interestRate){
        super(accNumber, accHolder, intialBalance);
        this.interestRate = interestRate;
    }

    public void apply_interest(){
        double interest = Balance * interestRate;
        Balance += interest;
        System.out.println("Applied interest of Rs. " + interest + ". New Balance: Rs. " + Balance);
    }

    @Override 
    public void displayAcdetails(){
        System.out.println("Savings Ac: " + accNumber);
        System.out.println("Ac Holder: " + accHolder);
        System.out.println("Balance: " + interestRate);
    }
}
