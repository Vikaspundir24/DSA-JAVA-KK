import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        //Student[] students = new Student[2];
        //just declaring
        //Student Vikas;
        //Vikas = new Student();
        Student vikas  = new Student(12,"VIKAS PUNDIR", 99.4f);
        Student ramnath =  new Student();
//        vikas.rno = 12;
//        vikas.name = "Vikas pundir";
//        vikas.marks= 99.5f;
//        vikas.changeName("VP");
//        vikas.greeting();

        System.out.println(vikas.rno);
        System.out.println(vikas.name);
        System.out.println(vikas.marks);

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
    Student(){
        this.rno = 12;
        this.name = "Vikas pundir";
        this.marks= 99.5f;
    }
    Student(int rno, String name, float marks ){
        this.rno = rno;
        this.name = name;
        this.marks= marks;
    }
}