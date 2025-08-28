public class Main{
    public static void main(String[] args) {
        //pattern2(4);
        //pattern1(4);
        //pattern3(4);
        //pattern4(5);
        pattern5(5);
    }
    static void pattern2(int n){
        for (int row = 1 ; row <= n; row++){
            //for every row, rum the col
            for (int col = 1; col <=row; col++){
                System.out.print("* ");
            }
            // when one row is printer , we need to add a new line
            System.out.println("");
        }
    }
    static void pattern1(int n){
        for (int row = 1 ; row <= n; row++){
            //for every row, rum the col
            for (int col = 1; col <=n; col++){
                System.out.print("* ");
            }
            // when one row is printer , we need to add a new line
            System.out.println("");
        }
    }
    static void pattern3(int n){
        for (int row = 1 ; row <= n; row++){
            //for every row, rum the col
            for (int col = 1; col <= n+1 - row; col++){
                System.out.print("* ");
            }
            // when one row is printer , we need to add a new line
            System.out.println("");
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <= n; row++){
         for (int col = 1; col<= row; col++ ){
             System.out.print(col + " ");
         }
            System.out.println("");
        }
    }

    //pattern 5 samajh ni aya

    static void pattern5(int n){
        for (int row = 0; row < 2 *n; row++){
            int totalColsInRow = row > n? 2*n - row : row;
            for (int col = 0; col < totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }




}