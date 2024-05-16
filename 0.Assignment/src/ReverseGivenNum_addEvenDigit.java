public class ReverseGivenNum_addEvenDigit {
    public static void main(String[] args) {

        int num= 12345;
        int reverseNum=0, sumOfEvenDigit=0;
        for(int i=num; i>0; i/=10){
            int r = i % 10;
            reverseNum = (reverseNum*10) + r;

            if (r%2==0) {
                sumOfEvenDigit = sumOfEvenDigit  + r;
            }
        }

        System.out.println("Original Number: " +num);
        System.out.println("Reverse Number: " + reverseNum);
        System.out.println("Sum of even digit: " + sumOfEvenDigit);

    }
}
