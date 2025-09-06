package String;

import java.util.ArrayList;

public class DiceAmazon {
    static ArrayList<String> result = new ArrayList<>();
    public static void main(String[] args) {
        result = dice("",4);
        System.out.println(result);
    }

    static ArrayList<String> dice(String p, int target){
        if(target == 0){
            result.add(p);
            return result;
        }
        for (int i = 1; i<= 6 && i<=target; i++){
            dice(p+i, target-i);

        }
        return result;
    }
}
