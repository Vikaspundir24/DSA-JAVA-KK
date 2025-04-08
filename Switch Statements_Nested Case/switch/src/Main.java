import java.util.Scanner;
public  class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
//
//        switch (fruit){
//            case "apple":
//                System.out.println("Red Fruit");
//                break;
//
//            case "mango":
//                System.out.println("king Fruit");
//                break; // if no break then all other after this will be executed doesnt matter about the case
//
//            case "grapes":
//                System.out.println("small Fruit");
//                break;
//
//            case "orange":
//                System.out.println("round Fruit");
//                break;
//
//            default:
//                System.out.println("enter a valid fruit");
//        }

        // NEW STYLE


        switch (fruit) {
            case "apple" -> System.out.println("Red Fruit");
            case "mango" -> System.out.println("king Fruit");
            // if no break then all other after this will be executed doesnt matter about the case

            case "grapes" -> System.out.println("small Fruit");
            case "orange" -> System.out.println("round Fruit");
            default -> System.out.println("enter a valid fruit");
        }

    }
}