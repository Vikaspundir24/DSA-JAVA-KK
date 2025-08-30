package Easy;

public class sumOfDigits {
    public static void main(String[] args) {
        int n = 111;
        System.out.println(sod(n));
    }
    static int sod(int n){
        if (n / 10 == 0){
            return n;
        }
        return (n%10)+sod(n/10);
    }
}
