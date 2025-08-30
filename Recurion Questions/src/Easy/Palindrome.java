package Easy;

public class Palindrome {
    public static void main(String[] args) {
        int n = 11;
        reverseNum(n);
        System.out.println(checkPalindrome(n));

    }
    static int sum = 0;
    static void reverseNum(int n){
        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum *10 + rem;
        reverseNum(n/10);
    }
    static boolean checkPalindrome(int n){
        if(n == sum){
            return true;
        }
        return false;
    }

}
