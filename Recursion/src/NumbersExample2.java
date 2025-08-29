public class NumbersExample2 {
    public static void main(String[] args) {
        // write a function that takes in a number and print it
        // print first 5 numbers 1 2 3 4 5
        print1(1);
    }
    static void print1(int n) {
        if (n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //recursive call
        // if you are calling a function again and again,
        // you can treat it as a seperate call in the stack
        print1(n+1);
    }
}
