package Tutorial;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X OR x
        int  ans = 0;
         while (true){
             System.out.println("enter operator");
             char op = in.next().trim().charAt(0);
             if(op == '+' || op == '-' ||op == '/' ||op == '%'){
                 System.out.println("enter 2 numbers");
                 int num1 = in.nextInt();
                 int num2 = in.nextInt();

                 if (op == '+'){
                     ans = num1 + num2;

                 }
                 if (op == '-'){
                     ans = num1 - num2;

                 }
                 if (op == '/'){
                     ans = num1 / num2;

                 }
                 if (op == '%'){
                     ans = num1 % num2;

                 }
             }
             else if (op == 'X' || op == 'x') {
                 System.out.println(ans);
                 break;
             }
             else {
                 System.out.println("add a valid op");
             break;
             }

             System.out.println(ans);
             return;

         }


    }
}
