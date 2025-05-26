import java.util.Scanner;

public class arguments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers first");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int ans = sum2(num1,num2);

        System.out.println("Enter the name of the person");
        String name = in.next();
        String greet = greeting(name);
        System.out.println(greet);
    }

    //passing the value of numbers when you are calling the method in main();

    static int sum2(int a, int b){

        int sum = a + b;
        System.out.println("The sum of 2 nums = " + sum);
        return sum;
    }

    static String greeting(String message){
        String greet = "hello " + message;
        return greet;

    }
}
