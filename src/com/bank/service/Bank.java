package com.bank.service;

import com.bank.model.BankAccount;
import java.util.ArrayList;
import java.util.List;

public class Bank{

    private List<BankAccount> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }
    
    public void addacc(BankAccount account){
        accounts.add(account);
        System.out.println("Account: " + account.getAccNumber() + " successfully created.");
    }

    public BankAccount findAccount(String accNumber){
        for (BankAccount acc : accounts){
            if (acc.getAccNumber().equals(accNumber)){
                return acc;
            }
        }
        return null;
    }

    public void listAllAccounts(){
        if (accounts.isEmpty()){
            System.out.println("No accounts registered in the bank.");
            return;
        }
        else{
            System.out.println("\n--- Bank Accounts Registry ---");
            for (BankAccount acc : accounts){
                acc.displayAcdetails();
            }
            System.out.println("------------------------------");
        }
    }
    
}

