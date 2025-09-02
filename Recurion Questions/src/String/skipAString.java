package String;

public class skipAString {
    public static void main(String[] args) {
        String str = "jnsfjapplekansjfna";
        System.out.println(skip(str));
    }
    static String  skip(String str){
        if (str.isEmpty()){
            return "";
        }
        if (str.startsWith("apple")){
            return skip(str.substring(5));
        }
        return str.charAt(0) + skip(str.substring(1));

    }
}
