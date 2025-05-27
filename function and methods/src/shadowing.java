public class shadowing {
    static int x=90;  // this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; //the class variable at line 2 is shadowed by this

        x = 40; // scope will begin when value is initialised.
        System.out.println(x); // 40
        fun();
    }

    static void fun()
    {
        System.out.println(x); // 90
    }
}
