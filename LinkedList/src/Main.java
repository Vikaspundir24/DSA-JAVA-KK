import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
       //Student[] students = new Student[2];
       //just declaring
        //Student Vikas;
        //Vikas = new Student();
        Student vikas  = new Student();
//        vikas.rno = 12;
//        vikas.name = "Vikas pundir";
//        vikas.marks= 99.5f;

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

    Student(){
        this.rno = 12;
        this.name = "Vikas pundir";
        this.marks= 99.5f;
    }
}