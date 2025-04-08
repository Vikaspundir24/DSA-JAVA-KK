package Tutorial;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        int inputNum = in.nextInt();
        System.out.println("Which number's occurrence do you want to search??");
        int inputSearch = in.nextInt();
        while(inputNum>0)
        {
            int value = inputNum % 10;
            inputNum = inputNum/10;
            if(value == inputSearch){
                count++;
            }
        }
        System.out.println(count);
    }
}
