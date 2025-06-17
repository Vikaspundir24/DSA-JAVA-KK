public class searchInStrings {
    public static void main(String[] args) {
        String name = "Vikas";
        char target = 'k';
        System.out.println(search(name,target));
        System.out.println(search2(name,target));
    }

   // normal way

    static boolean search (String str,char target){
        if(str.length()== 0) return false;

        for(int i=0; i< str.length();i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    //for each
    static boolean search2 (String str,char target){
        if(str.length()== 0) return false;

        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
