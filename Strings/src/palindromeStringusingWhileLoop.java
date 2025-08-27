public class palindromeStringusingWhileLoop {
    public static void main(String[] args) {
        String s = "as";
        s = s.toLowerCase();
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() -1;
        while (i< j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
