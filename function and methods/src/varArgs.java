// when we do not know how many inputs we are giving
//variable arguments


import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2,3,4,2,3,4,4,5,6); // 0 or more args
        multipleTypes(23,4,"hey", "hi"); // order matters
    }
    static  void fun(int ...v) // taking array of type integers
    {
        System.out.println(Arrays.toString(v));
    }

    static void multipleTypes(int a, int b, String ...v) // order matters...variable parameter should be last in the list
    {
        System.out.println(Arrays.toString(v));
    }
}


