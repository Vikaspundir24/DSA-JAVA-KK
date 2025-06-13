import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //2D array
        // int[rows][column] name  = new int [rows][];
        /* 1 2 3
           4 5 6
           7 8 9
         */

      //  int[][]arr = new int[3][]; //number of rows is mandatory not column

        int [][] arr2D = {
                {1,2,3}, // 0th index
                {4,5,6},
                {7,8,9,10}
        };


        int [][] arr = new int[3][2];
        //input


        for(int row = 0; row <arr.length; row++){

            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();
            }
        }


        // output

        for(int row = 0; row <arr.length; row++){

            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // OR

        for (int row = 0; row< arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }




    }
}
