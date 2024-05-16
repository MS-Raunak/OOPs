package com.abstractkeyword.realworldexample;

import java.util.Scanner;

abstract class Bank{
    abstract double rateOfInterest();
}

class HDFC extends Bank{
    @Override
    double rateOfInterest() {
        return 0.14; // it means 14%
    }
}

class ICICI extends Bank{
    @Override
    double rateOfInterest() {
        return 0.12; // it means 12%
    }
}

class SBI extends Bank{

    @Override
    double rateOfInterest() {
        return 0.09; // it means 9%
    }
}

class BankDetails{

    void homeLoans(Bank bank, double amount){
        double roi = bank.rateOfInterest();
        double per_roi = roi * 100; // change to percentage

        int perRateOfInt = (int) per_roi;
        double interestAmount = roi * amount;
        double totalAmount = interestAmount + amount;

        System.out.println(bank.getClass().getSimpleName() +
                " bank charges " + perRateOfInt + "% rate of interest for homeloans");

        System.out.println(bank.getClass().getSimpleName() +
                " bank will charged " + interestAmount + "rs. extra for Rs" + amount + " amount");

        System.out.println(bank.getClass().getSimpleName() +
                " bank will charged Rs" + totalAmount + " total amount for Rs" + amount + " amount" );
    }
}


public class BankAppDevelopment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankDetails bankDetails = new BankDetails();

        boolean flag = true;

        while (flag){
            System.out.print("""
                1. HDFC
                2. ICIC
                3. SBI
                Please select any bank for homeloans..
                """);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    bankDetails.homeLoans(new HDFC(), 10000);
                    break;
                case 2:
                    bankDetails.homeLoans(new ICICI(), 20000);
                    break;
                case 3:
                    bankDetails.homeLoans(new SBI(), 18000);
                    break;
                default:
                    System.out.println("Wrong Input..Please try again!");
            }
            System.out.println("\nDo you want to continue?(yes:1)");
            int ch = sc.nextInt();
            if (ch!=1){
                flag = false;
                System.out.println("Thank you");
            }
        }


    }
}
