import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();


        switch (empID){
            case 1:
                System.out.println("VP");
                break;
            case 2:
                System.out.println("SP");
                break;
            case 3:
                System.out.println("EMP NUMBER 3");
               switch (department){
                   case "IT":
                       System.out.println("IT dept");
                       break;
                   case "management":
                       System.out.println("management dept");
                       break;
                   default:
                       System.out.println("no dept entered");
               }
               break;

            default:
                System.out.println("enter correct emp id");
        }


// BETTER WAY TO WRITE
        switch (empID) {
            case 1 -> System.out.println("VP");
            case 2 -> System.out.println("SP");
            case 3 -> {
                System.out.println("EMP NUMBER 3");
                switch (department) {
                    case "IT" -> System.out.println("IT dept");
                    case "management" -> System.out.println("management dept");
                    default -> System.out.println("no dept entered");
                }
            }
            default -> System.out.println("enter correct emp id");
        }
    }
}
