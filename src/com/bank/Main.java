package com.bank;   

import java.util.Scanner;
import com.bank.model.*;
import com.bank.service.*;;

public class Main {
    public static void main(String[] args){
        Bank myBank = new Bank();
        Scanner sc = new Scanner(System.in);
        boolean running = true;


        System.out.println("==== Welcome to the JAVA OOP Bank System =====");

        while (running){
            System.out.println("\nChoose an option:");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. View All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1: 
                    System.out.println("Enter A/C number: ");
                    String s_accNo = sc.nextLine();

                    System.out.println("Enter A/C holder Name: ");
                    String s_accHolder = sc.nextLine();

                    System.out.println("Enter intial deposit amount: ");
                    double s_intialBalance = sc.nextDouble();

                    System.out.println("Enter Interest Rate (0.05 for 5%): ");
                    double s_interestRate = sc.nextDouble();

                    SavingsAccount savings = new SavingsAccount(s_accNo,s_accHolder,s_intialBalance,s_interestRate);
                    myBank.addacc(savings);

                case 2:
                    System.out.println("Enter A/C number: ");
                    String c_accNo = sc.nextLine();

                    System.out.println("Enter A/C holder Name: ");
                    String c_accHolder = sc.nextLine();

                    System.out.println("Enter intial deposit amount: ");
                    double c_intialBalance = sc.nextDouble();

                    System.out.println("Enter overdraft limit: ");
                    double c_overdraftlimit= sc.nextDouble();

                    CurrentAccount current = new CurrentAccount(c_accNo, c_accHolder, c_intialBalance, c_overdraftlimit);
                    myBank.addacc(current);
                
                case 3:
                    System.out.println("Enter A/C number: ");
                    String dep_accno = sc.nextLine();
                    BankAccount depAc = myBank.findAccount(dep_accno);

                    if (depAc != null){
                        System.out.println("Enter deposit amount: ");
                        double dep_amount = sc.nextInt();
                        depAc.Deposit(dep_amount);
                    }
                    else{
                        System.out.println("Account not found.");
                    }
                
                case 4:
                    System.out.println("Enter A/C number: ");
                    String wit_accno = sc.nextLine();
                    BankAccount witAc = myBank.findAccount(wit_accno);

                    if (witAc != null){
                        System.out.println("Enter withdrawal amount: ");
                        double wit_amount = sc.nextInt();
                        witAc.Withdraw(wit_amount);
                    }
                    else{
                        System.out.println("Account not found.");
                    }
                case 5:
                    myBank.listAllAccounts();
                    break;

                case 6:
                    running = false;
                
                
                default:
                    System.out.println("Invalid choice. Please try again.");                    
            }
        }
        sc.close();
    }
    } 
