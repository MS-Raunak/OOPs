package com.upcast.bank;

import java.util.Scanner;

class Bank{
    double interestRate(){
        return 0;
    }
}
class HDFC extends Bank{
    double interestRate(){
        return 0.14;  // 14%
    }
}

class ICICI extends Bank{
    double interestRate(){
        return 0.12;  // 14%
    }
}

class SBI extends Bank{
    double interestRate(){
        return 0.09;  // 14%
    }
}

class Salesman{
    public void showBankInterest(Bank bank){
        double interest = bank.interestRate();
        double interestPer = interest*100;
        int interestI = (int) interestPer;
        System.out.println(interestI + "% Interest of " + bank.getClass().getSimpleName() + " bank");
    }
}


public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salesman salesman = new Salesman();
        System.out.println("""
                1.HDFC
                2.ICICI
                3.SBI""");
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> salesman.showBankInterest(new HDFC());
            case 2 -> salesman.showBankInterest(new ICICI());
            case 3 -> salesman.showBankInterest(new SBI());
            default -> System.out.println("Invalid input..");
        }

    }
}
