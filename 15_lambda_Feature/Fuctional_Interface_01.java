
public interface Fuctional_Interface_01 {
    public void m1();
    public static void m2 (){
        System.out.println("static method called");
    }
    default void m3(){
        System.out.println("default method called ");
    }
}
class Test{
    public static void main(String[] args) {
        System.out.println("second method called");
        Fuctional_Interface_01.m2();
        Fuctional_Interface_01 obj= new Fuctional_Interface_01() {
            @Override
            public void m1() {

            }
        };
        System.out.println(" first method called");
        obj.m1();
        System.out.println(" third method called");
        obj.m3();
    }
}