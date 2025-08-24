public class Comparison {
    public static void main(String[] args) {
        String a  = "vikas";
        String b = "vikas";

        // ==
        // System.out.println(a == b); //TRUE

        String name1 = new String("vikas");
        String name2 =  new String("vikas");

        System.out.println(name1 == name2); //FALSE

        System.out.println(name1.equals(name2)); // TRUE

        System.out.println(name1.charAt(0));
    }
}