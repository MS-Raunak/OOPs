public class SwapNumber {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        System.out.println("a="+a + " " + "b="+b);

        // Swapping by using 3rd variable
        /*
        int c;
        c = a+b;
        a = c-a;
        b = c-a;

        System.out.println("a="+a + " " + "b="+b);

         */

        // swapping using without using 3rd variable
        /*
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a="+a + " " + "b="+b);

         */

        // swapping without arithmetic and 3rd variable
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a="+a + " " + "b="+b);
        /*
               a(20) => 1 0 1 0 0
               b(30) => 1 1 1 1 0
           a = a^b   => 0 1 0 1 0

                   a => 0 1 0 1 0
                   b => 1 1 1 1 0
           b = a^b   => 1 0 1 0 0 ( b = a = 20)

                   a => 0 1 0 1 0
                   b => 1 0 1 0 0
           a = a^b   => 1 1 1 1 0 ( a = b = 30)

           Swapped value
           a=30
           b=20
         */
    }
}
