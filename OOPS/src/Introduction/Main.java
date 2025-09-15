import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        //Student[] students = new Student[2];
        //just declaring
        //Student Vikas;
        //Vikas = new Student();

        Student vikas  = new Student();
        //Student ramnath =  new Student(10,"Ramnath Kumar", 99.f);

        //vikas.rno = 12;
        //vikas.name = "Vikas pundir";
        //vikas.marks= 99.5f;

        //ramnath.changeName("Suraj");

        //vikas.greeting();
        //ramnath.greeting();

        System.out.println(vikas.rno);
        System.out.println(vikas.name);
        System.out.println(vikas.marks);

        Student random = new Student(vikas);
        System.out.println(random.name);

        Student random2   = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two  = one;

        one.name = "Something Something";
        System.out.println(two.name);
    }

}
class Student {
    int rno;
    String name;
    float marks;
    // we need a way to add the values of the above
    //properties object by object
    //we need one word to access every object

    void greeting(){
        System.out.println("Hello, my name is " + this.name);
    }
    void changeName(String newName){
        this.name = newName;
    }
//    Student(){
//        this.rno = 12;
//        this.name = "Vikas pundir";
//        this.marks= 99.5f;
//    }

    Student(){
       //thisis how you call a constructor from another constructor
        // internally : new Student()
        this(13,"Default person", 100.0f);
    }

    //Student arpit =new Student (17,"Arpit", 89.f);
    // here, this will be replaced with arpit
    Student(int rno, String name, float marks ){
        this.rno = rno;
        this.name = name;
        this.marks= marks;
    }
    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}