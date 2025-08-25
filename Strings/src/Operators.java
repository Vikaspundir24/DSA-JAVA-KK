import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");

        // + opera tor is used as operator overloading in case of STRINGs only!!

        System.out.println((char)('a' + 2));
        System.out.println("a" + 1);

        // this is same as after a few steps : "a" + "1";
        //integer will be converted to Integer that will call toString()

        System.out.println("Vikas" + new ArrayList<>());
        System.out.println("vikas" + new Integer(55));

        //Object will directly call toString function

       // System.out.println(new Integer(55) + new ArrayList<>());

        //produces error...operator + cannot be applied to Integer and ArrayList
        // + is used for atleast for one string!
        //+ is used for primitives and string too!
        // +  is used for string and objects too!
        System.out.println(new Integer(55) + "" + new ArrayList<>() );


    }
}
