
public class Static_variable {
    int a=45;
    static int b=45;

    public static void main(String[] args) {
        System.out.println(b);

        System.out.println(Static_variable.b);
//        System.out.println(a);  non static variable can not use in static field

    }
}
