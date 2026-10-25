package com.bank.model;

public abstract class BankAccount {
    protected String accNumber;
    protected String accHolder;
    protected double Balance;

    public BankAccount(String accNumber, String accHolder, double initialBalance){
        this.accNumber = accNumber;
        this.accHolder = accHolder;

        if (initialBalance>=0.0) { 
            this.Balance = initialBalance;
        }
        else{
            this.Balance = 0.0;
            System.out.println("Intial balance cannot be negative. Set to 0.0");
        }

    }

    public void Deposit(double amount){
        if (amount>0){
            Balance +=amount;
            System.out.println("Successfully deposited: Rs." + amount);
        }
        else{
            System.out.println("Invalid Amount. The value should be greater than zero");
        }
    }

    public void Withdraw(double amount){
        if (amount>0 && amount<=Balance){
            Balance -=amount;
            System.out.println("Successfully Withdrew: Rs." + amount);
        }
        else{
            System.out.println("Invalid Amount or Insufficient Balance");
        }
    }
    

    //Getters
    public String getAccNumber(){
        return accNumber;
    }

    public String getAccHolder(){
        return accHolder;
    }

    public double getBalance(){
        return Balance;
    }

    public abstract void displayAcdetails();
}
