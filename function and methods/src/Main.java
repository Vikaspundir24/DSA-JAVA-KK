import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;

        System.out.println("enter the first num");
        num1 = in.nextInt();
        System.out.println("enter the second num");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum of 2 nums = " + sum);
    }
}

// but if we have to repeat the same program 200 times then it will be ineffiecient to copy paste it
// 200 time....therefore we use methods (functions inside class)