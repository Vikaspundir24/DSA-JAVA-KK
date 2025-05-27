public class fncOverloading {
    public static void main(String[] args) {
        fun(788);
        fun("heyy yoo");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);

    }
}
// two fnc with same name with different parameters or different number of parameters can exist.
// function to run is decided at compile time...