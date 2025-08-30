package Easy;

public class productOfDigits {
    public static void main(String[] args) {
        int n = 111;
        System.out.println(pod(n));
    }
    static int pod(int n){
        if (n / 10 == 0){
            return n;
        }
        return (n%10)*pod(n/10);
    }
}
