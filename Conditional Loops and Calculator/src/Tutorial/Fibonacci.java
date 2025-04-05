package Tutorial;

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        /* all about if else which I already know */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        for(int i = 1; i<=n; ++i){
            System.out.println(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }

    }
}