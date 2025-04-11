import java.util.Scanner;

public class Sum {
    public static void main(String[] args)
    {
       int ans = sum2();
        System.out.println(ans);
    }

    //METHOD

    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;

        System.out.println("enter the first num");
        num1 = in.nextInt();
        System.out.println("enter the second num");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum of 2 nums = " + sum);
    }
    //RETURN THE VALUE
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;

        System.out.println("enter the first num");
        num1 = in.nextInt();
        System.out.println("enter the second num");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum of 2 nums = " + sum);
        return sum;
    }
}
