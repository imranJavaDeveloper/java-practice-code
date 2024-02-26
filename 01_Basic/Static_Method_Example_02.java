
public class Static_Method_Example_02 {

     // create static variable
    private static int a=45;
    public static void mi(){
        System.out.println("first block called ");
    }
    public  static void m2(){
        System.out.println("second method called");
    }

    public static void m3(){
        System.out.println("third method called");
    }
    public static void m4(){
        System.out.println("call static variable using the static methods "+a);
    }

    public static void main(String[] args) {
        // Access static method
        Static_Method_Example_02.mi();
        Static_Method_Example_02.m2();
        Static_Method_Example_02.m3();
        Static_Method_Example_02.m4();


    }
}
