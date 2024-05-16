import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CheckNum {

    // 1.Count digit in a number
    static int countNum(int number){
        int count = 0;
        for (int i=number; i>0; i/=10){
            int digit = i%10;
            count++;
        }
        System.out.println("Total digit("+number+") = " + count);
        return count;
    }

    //2.Reverse Number
    static int reverseNum(int origNum){
        int revNum = 0;
        for (int i=origNum; i>0; i/=10){
            revNum  = (revNum*10) + i%10;
        }
        System.out.println("Reverse Number:" + revNum);
        return revNum;
    }

    // 3.Palindrome Number : originalNum = ReverseNum
    static void palindromeNum(int origNum){
        if (origNum == reverseNum(origNum))
            System.out.println(origNum + " Palindrome Number");
        else
            System.out.println(origNum + " not a Palindrome Number");

        callAgain();
    }

    // 4. Factorial Number : 5 = 1*2*3*4*5=120
    static void factorialNum(int num){
        int fact = 1;
        for (int i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("Factorial(" + num + ") = " + fact);

        callAgain();
    }

    // 5. Decimal To Binary : 20 = 10100
    static void decimalToBinary(int dNum){
        int decNum = dNum;
        String binNum= "";  // always take String while solving decimal to binary
        while (dNum>0){
           int remainder= dNum % 2;
           binNum = remainder + binNum;
           dNum /= 2;
        }
        System.out.println("Binary Number(" + decNum + ") = " + binNum);

        callAgain();
    }

    // 6. Binary To Decimal
    static void binaryToDecimal(int binNum){
        int decNum = 0;
        int count = 0;
        for (int i=binNum; i>0; i/=10){
            int digit = i%10;
            decNum = decNum + digit * (int)Math.pow(2,count);
            count++;
        }
        System.out.println("Decimal Number(" + binNum + ") = " + decNum);

          // checking with various number
            callAgain();
    }

    // 7. Fibonacci Number: 0 1 1 2 3 5 8 13 21 .......
    static void fibonacciNum(int num){
        int a = 0 , b=1 , c;
        for (int i=1; i<=10; i++){
            c = a+b;
            System.out.print(a + " ");
            a=b;
            b=c;
        }

        callAgain();
    }

    // 8. Last 3 fibonacci series
    static void lastThreeFibonacciSeries(int num){
        int a = 0, b =1, c;
        for (int i=a; i<=num; i++){
            c = a+b;
            a=b;
            b=c;
            if (i>num-3)
                System.out.print(a + " ");
        }

        callAgain();
    }

    /* 9. Perfect Number: sum of total divisor of number except number itself = number
        EX: divisor(6) = 1,2,3 (1+2+3 = 6)*/
    static void perfectNum(int num){
        int sum = 0;
        for (int i=1; i<=num/2; i++){
            if ( num%i == 0){
                sum = sum + i;
            }
        }
        if (sum==num)
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is not a Perfect Number");

        callAgain();
    }


    // 10. Perfect number in range
    static void perfectNumberInRange(int minVal, int maxVal){


       for (int i = minVal; i<=maxVal; i++){    // num
           int sum = 0;
           for (int j =1; j<=i/2; j++){        // divisor
               if (i%j==0){
                   sum = sum + j;
               }
           }
           if (sum==i)
               System.out.print(i + ", ");

       }
    }

    // 10. Perfect number in range
    static void perfectNumInRange(int low_range, int high_range){
        // swapping
        if (low_range>high_range){
           // System.out.println("a=" + a + " " + "b=" + b);
           low_range = low_range + high_range;
           high_range = low_range - high_range;
           low_range = low_range - high_range;
           // System.out.println("a=" + a + " " + "b=" + b);
        }

        for (int num = low_range; num <= high_range; num++){
            int sum_of_div = 0;
            for (int div=1; div<=num/2; div++){
                if (num % div == 0)
                    sum_of_div = sum_of_div + div;
            }
            if (sum_of_div == num)
                System.out.println(num + " is a perfect number");
        }


        callAgain();

    }

    // 11. Prime Number : number divisible by either 1 or itself(2,3,5,7,11...)
    static void primeNum(int num) {
        if (num > 1) {
            boolean flag = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag)
                System.out.println(num + " is a Prime Number");
            else
                System.out.println(num + " is not a Prime Number");

            callAgain();
        }
        else {
            System.out.println(num + " is not a Prime Number");
        }
    }

    // 12. Prime number in range
    static void primeNumInRange(int low_range, int high_range){

        for (int num=low_range; num<=high_range; num++){

            if (num == 1 || num == 0) continue;

            boolean flag = true;
            for (int i=2; i<=num/2; i++){
                if (num%i == 0){
                    flag=false;
                    break;
                }
            }
            if (flag)
                System.out.println(num + " is a prime number");
        }

        callAgain();
    }

    // 12.Last 3 alternate prime number within the range
    static void last3AlternatePrimeNum(int min_range, int max_range){

        int count = 0;
        int lastPrimeNum=0;
        for (int num=min_range; num<=max_range; num++){

            if (num == 1 || num == 0) continue;   // 1 and 0 is not a primeNum

            boolean flag = true;
            for (int i=2; i<=num/2; i++){
                if (num%i==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(num + ", ");
                lastPrimeNum = num;             // last prime number
            }
        }
        System.out.println();

        // Last 3 prime number
        for (int num = lastPrimeNum; num>=min_range; num--){
            int flag = 1;
            for (int i=2; i<=num/2; i++){
                if (num%i == 0){
                    flag = 0;
                    break;
                }
            }
            if (flag==1){
                count++;
                if (count<6){
                    if (count%2!=0)
                        System.out.println("Alternate prime number from last: " + num);
                }
            }
        }



        callAgain();
    }

    // 13. Alternative prime number in range
    static void alterPrimeNumInRange(int low_range, int high_range){

        int count = 0;
        for (int num = low_range; num<=high_range; num++){
            if (num == 1 || num == 0) continue;
            boolean flag = true;
            for (int i=2; i<=num/2; i++){
                if (num%i == 0){
                    flag = false;
                }
            }
            if (flag) {
                count++;
                if (count%2!=0)
                    System.out.print(num + ", ");
                else
                    System.out.print("--" + " ");
            }
        }
        callAgain();
    }

    // 14. prime number who is multiple of 3:
    static void primeNumMultipleOfgivenNum(int low_range, int high_range){

        for (int num=low_range; num<=high_range; num++){
            if (num == 1 || num == 0) continue;
            boolean flag = true;
            for (int i=2; i<=num/2; i++){
                if (num%i==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                if (num%3==0)
                    System.out.println(num + " is a prime number who is multiple of 3");
            }
        }

        callAgain();
    }

    // 15. Done Number : number first digit and last digit without zero (EX: 1211, 12002)
    static void doneNum(String num){

        int length = num.length();
        if (num.charAt(0) == '0' || num.charAt(length-1) == '0')
            System.out.println("Not done");
        else
            System.out.println("done");

        callAgain();
    }


    /* 16. Armstrong Number: num : sum of count power of each digit
    EX: 153 = 1^3 + 5^3 + 3^3, 12345 = 1^5 + 2^5 + 3^5 + 4^5 + 5^5 */
    static void armstrongNum(int num){
        int totalDigit = countNum(num);
        int sum = 0;
        for (int i=num; i>0; i/=10){
            int digit = i%10;
            System.out.println(digit + "^" + totalDigit + " = " + (int)Math.pow(digit,totalDigit));
            sum = sum + (int) Math.pow(digit,totalDigit);
        }
        System.out.println("Total:" + sum);
        if (num == sum)
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is not an Armstrong Number");

       callAgain();
    }

    // 17. Armstrong number in range
    static void armstrongNumInRange(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range");
        int min_val = sc.nextInt();
        int max_val = sc.nextInt();

        for (int num = min_val; num<=max_val; num++){
            int count = 0;
            int sum = 0;
            for (int i=num; i>0; i/=10){
                int digit = i%10;
                count++;
            }
            for (int i=num; i>0; i/=10){
                int digit = i%10;
               sum = sum + (int)Math.pow(digit,count);
            }
            if (num == sum)
                System.out.println(num + " is a Armstrong Number");
        }

        callAgain();
    }

    // 18. Strong Number: num =sum of factorial of each digit EX: 145
    static void strongNum(int num){
        int sum = 0;

        for (int i=num; i>0; i/=10){
            int digit = i%10;
            // factorial of each digit
            int fact = 1;
            for (int j=1; j<=digit; j++) {
                fact = fact * j;
            }
            System.out.println(digit + "! = " + fact);
            // Sum of all factorial of each digit
            sum = sum + fact;

        }
        System.out.println("Sum: " + sum);
        if (num == sum)
            System.out.println(num + " is a Strong Number");
        else
            System.out.println(num + " is not a Strong Number..");

        callAgain();
    }

    // 19. Strong Number in range
    static void strongNumInRange(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range:");
        int min_val = sc.nextInt();
        int max_val = sc.nextInt();

        for (int num = min_val; num<=max_val; num++){
            int sum = 0;
            for (int i=num; i>0; i/=10){
                int digit = i%10; // find digit

                int fact = 1;
                // factorial of each digit
                for (int j=1; j<=digit; j++)
                    fact = fact*j;
                sum = sum + fact;  // sum of all factorial
            }

            if (num == sum)
                System.out.println(num + " is a strong number");
        }


        callAgain();
    }


    // call all methods
    static void callMethods(){
        Scanner sc = new Scanner(System.in);
        int num;
        String s = "";
        int min_range = 0;
        int max_range = 0;

        System.out.println("""
                1.Number
                2.Range of number
                3.String
                Please select your input choice:""");
        int option = sc.nextInt();

        switch (option) {
            case 1 -> {
                System.out.print("Enter Number:");
                num = sc.nextInt();
            }
            case 2 -> {
                System.out.print("Enter Range:");
                min_range = sc.nextInt();
                max_range = sc.nextInt();
            }
            case 3 -> {
                System.out.print("Enter Number:");
                s = sc.next();
            }
            default -> System.out.print("Please select valid option..");
        }

        //countNum(num);
        //reverseNum(num);
        //factorialNum(num);
        //palindromeNum(num);
        // decimalToBinary(num);
        // binaryToDecimal(num);
        // fibonacciNum(num);
        //lastThreeFibonacciSeries(num);
        //perfectNum(num);
        //perfectNumberInRange();
        // perfectNumInRange();
        // primeNum(num);
        //primeNumInRange();
        // alterPrimeNumInRange();
        // primeNumMultipleOfgivenNum();
        // doneNum(s);
        //armstrongNum(num);
        // armstrongNumInRange();
        // strongNum(num);
        //strongNumInRange();
        last3AlternatePrimeNum(min_range, max_range);

    }
    //Method for Checking Number multiple times
    static void callAgain(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDo you want to continue?(yes/1):");
        int ch = sc.nextInt();

        if (ch==1)
            main(null);
        else
            System.out.println("\tTHANK YOU!");
    }

    // main method
    public static void main(String[] args) {
        callMethods();
    }
}
