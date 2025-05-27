import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Printing all three digits number which are armstrong");
        for(int i = 100; i<1000; i++)
        {
            int tempNum = i;
            int sum = 0;
            while (tempNum>0)
            {
                int rem = tempNum % 10;
                rem = rem * rem * rem;
                sum += rem;
                tempNum = tempNum / 10;
            }

            if (sum == i){
                System.out.println(i);
            }
        }


    }
}


// now with better aproach and optimisation


