import java.util.Arrays;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0; i< arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

// Array of Objects :
        String[] str = new String[2];
        for (int i =0; i< str.length; i++){
            str[i] = input.next();
        }
        for (int i =0; i< str.length; i++){
            System.out.println(str[i]);
        }
        System.out.println(Arrays.toString(str));
//modify objects
        str[0] = "updated";
        System.out.println(Arrays.toString(str));
    }
}



