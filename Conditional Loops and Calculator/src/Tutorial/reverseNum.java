package Tutorial;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int rev = 0;
        while(input>0) {
            int lastDig = input % 10;
            rev = rev * 10 + lastDig;
           input = input / 10;

        }
        System.out.println(rev);
    }
}
