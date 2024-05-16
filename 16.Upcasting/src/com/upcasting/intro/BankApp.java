package com.upcasting.intro;

import java.util.Scanner;

class Bank{
    double roi(){  // Rate Of Interest
        return 0.0;
    }
}

class HDFC extends Bank{
    double roi(){
        return 0.15;
    }
}

class ICICI extends Bank{
    double roi(){
        return 0.12;
    }
}

class SBI extends Bank{
    double roi(){
        return 0.09;
    }
}

class Salesman{
    public void homeLoans(double amount, Bank bank){
        double roi = bank.roi();  // rate of interest of selecting bank
        double per_roi = roi * 100; // converting in percentage
        int percent_roi = (int) per_roi; // percentage converting in integer

        System.out.println(percent_roi + " % is the rate of interest charged by " + bank.getClass().getSimpleName() + " bank");

        double interest_amt = amount * roi; // total interest on your amount
        System.out.println(interest_amt + " is the amount charged by " + bank.getClass().getSimpleName() + " bank");

        double total = amount + interest_amt; // total amount to pay
        System.out.println(total + " is the total sum to be paid for the amount to the " + bank.getClass().getSimpleName() + " bank");
    }
}


public class BankApp {
    public static void main(String[] args) {
        Salesman salesman = new Salesman();
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                1.HDFC
                2.ICICI
                3.SBI
                Choose Your Bank:
                """);
        int choice = sc.nextInt();
        double amount;

        switch (choice) {
            case 1 -> {
                amount = getAmount();
                salesman.homeLoans(amount, new HDFC());
            }
            case 2 -> {
                amount = getAmount();
                salesman.homeLoans(amount, new ICICI());
            }
            case 3 -> {
                amount = getAmount();
                salesman.homeLoans(amount, new SBI());
            }
            default -> System.out.println("Enter valid input...");
        }

    }

    // Input Amount
    static double getAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        return sc.nextInt();
    }
}
