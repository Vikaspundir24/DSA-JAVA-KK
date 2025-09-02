package String;

public class RemovingACharacter {
    public static void main(String[] args) {
        String str = "aaaaaccddbaa";
        skip("",str);   //=>> first approach
        String ans = skip2(str); // ==>> SECOND APPROACH
        System.out.println(ans);

    }
    static void skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            skip(p,up.substring(1));
        }
        else skip(p+ch,up.substring(1));
    }

    static String skip2( String up){
        if (up.isEmpty()){

            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            return skip2(up.substring(1));
        }
        else  return ch + skip2(up.substring(1));
    }
}
