import java.util.ArrayList;
import java.util.Scanner;
// When you dont know how much size do we need for the array

public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        // ArrayList<Integer> list = new ArrayList<>()

        ArrayList<Integer> list = new ArrayList<>(2);
//        list.add(1);
//        list.add(45);
//        list.add(88);

//        System.out.println(list.contains(45));

//        list.set(0,99); // updated 0th index with 99
//        System.out.println(list);

        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }


    }
}
