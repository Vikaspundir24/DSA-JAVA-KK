package Backtracking;

public class Maze {
    static int output;
    public static void main(String[] args) {
        output = 0;
        fun(2,2);
        System.out.print(output);

    }
    static void fun(int row,int col){

        if(row == 1 || col == 1 ){
            output++;
            return;
        }
        fun(row-1,col);
        fun(row,col-1);
    }
}
