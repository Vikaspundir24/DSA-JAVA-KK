public class Main{
    public static void main(String[] args) {
        pattern1(3);
    }
    static void pattern1(int n){
        for (int row = 0 ; row <= n; row++){
            //for every row, rum the col
            for (int col = 0; col <=row; col++){
                System.out.print("* ");
            }
            // when one row is printer , we need to add a new line
            System.out.println("");
        }
    }
}