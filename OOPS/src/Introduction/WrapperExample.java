package Introduction;

public class WrapperExample {
    public static void main(String[] args)
    {
        //int  a= 10;
        //int b = 20;

        //Integer num =45;

        Integer a=10;
        Integer b = 20;

        swap(a,b);
        System.out.println(a+ " " + b);

        final A vikas = new A("vikas pundir");
        vikas.name = "other name";

        // when a non primitive is final, you cannot reasign it.
        //vikas = new A("new object");

        A obj;
        for (int i =0 ; i<109999999; i++){
            obj  = new A("random name");
        }


    }


    static void swap(Integer  a, Integer b){
        Integer temp = a;
        a=b;
        b =temp;
    }

}
class  A {
    final int  num = 10;
    String name;

    public  A(String name) {
       // System.out.println("object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
