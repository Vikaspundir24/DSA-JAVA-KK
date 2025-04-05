package vikas;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);
//
//        //type Casting
//
//        int num2 = (int) (67.33f);
//        System.out.println(num2);
//
//        // automatic type promotion in expression
//
//        int a = 257;
//        byte b = (byte) (a);
//        System.out.println(b); // 257 % 256 = 1
//
//        byte e = 40;
//        byte d = 50;
//        byte c = 100;
//        int f = e * d / c; // a and b automatically promoted to integers. as byte max value is 256
        // but then how 50 * 40 is being stored in byte!!1

//     ERROR = possible lossy conversion from int to byte
//        byte h = 50;
//         h = h *2;

        // RULES FOR PROMOTION OF VARIABLES

        // byte,short, char are promoted to integer
        // if any other operands is long then whole operation will be promoted to long ,  float ,double


        byte b = 42;
        char c = 'a';
        short x = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + ( i/ c) - ( d * x);
        System.out.println(result);
        System.out.println((f * b) + " " + ( i/ c)  +" " +  ( d * x));
        // float +  int - double = double
    }
}
