public class fibonacciNumbers {
    public static void main(String[] args) {

        System.out.println(recursionFibo(6));
    }
    static int recursionFibo(int n){
        if (n<2){
            return n;
        }
        return recursionFibo(n-1) + recursionFibo(n-2);
    }

}
