package Backtracking;

public class Maze {

    public static void main(String[] args) {
        System.out.println(count(3,3));
    }
    static int count(int r,int c){
        if (r==1 || c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;

    }

    static void path(String p, int r, int c){
        if(r == 1 && c==1 ){
            System.out.print(p);
            return;
        }
        if (row > 1){
            path(p+'D', r-1,c);
        }

    }
}
