package 16_Static_Control_Flow;

public class Example2 {
    // create static method called

    public  static  void method(){
        System.out.println("static method called");
    }

    public static void method2(){
        System.out.println("static method2 called");
    }

    static int k=455;

    static {

        System.out.println(" first static block called");
    }

    static {
        System.out.println("second static blocked");
    }

    static {
        System.out.println("third static blocked");
    }



    public static void main(String[] args) {

        Example2.k=55;
        System.out.println(Example2.k);

        Example2.method();
        Example2.method2();

    }
}
