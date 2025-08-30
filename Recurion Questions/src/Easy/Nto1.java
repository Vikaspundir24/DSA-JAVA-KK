package Easy;

public class Nto1 {
    public static void main(String[] args) {
        int n = 5;
        recursivePrint(n);
    }
    static void recursivePrint(int n){

        if (n==0){
            return;
        }
        System.out.println(n);

        recursivePrint(n-1);

    }


}
