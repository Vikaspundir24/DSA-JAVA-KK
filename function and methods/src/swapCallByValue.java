public class swapCallByValue {
    public static void main(String[] args) {
        String name = "vikas";
        changeName(name);
        System.out.println(name);

        //sout (naam); cant happen as it is not in the scope
    }

    static void changeName(String naam)
    {
        naam = "Vicky"; // not change, just creating a new object

    }
}

// java only has call by value ...not by reference
// for primitive data types (int short char byte ..) - it is only by pass by value
// for objects and stuff - passsing value of the reference variable.