/*
Check the number whether odd or even without using modulus(%).
 */

import java.util.Scanner;

public class CheckEvenOddWithoutUsingModulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num:");
        int num = sc.nextInt();

        if((num & 1) ==1){
            System.out.print(num + " Even Number");
        }
        else {
            System.out.println(num + " Odd Number");
        }
    }
}
