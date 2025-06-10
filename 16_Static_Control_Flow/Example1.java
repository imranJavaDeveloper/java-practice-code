package 16_Static_Control_Flow;

public class Example1 {

    // static variable
     static  int a=78;
     // create static method
    public static void m1(){
        System.out.println("static method called");
    }
    static {
        System.out.println("first static blocked");
    }
    static {
        System.out.println("second static blocked");
    }
    public static  void main(String args[]){

        // static method called
        Example1.m1();
        // call static variable
        System.out.println(Example1 .a);

        // 1 first static blocked called
        // 2 static method called
        // 3 static variable called



    }

}


