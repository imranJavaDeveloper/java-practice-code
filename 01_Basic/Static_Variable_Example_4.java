

public class Static_Variable_Example_4 {
    // Static create one copy and share this copy for all object
    // non - static variable create multiple copy denpend on object
    int a;
   static int b;

    public static void main(String[] args) {
        System.out.println(b); // direct use variable name
        System.out.println(Static_Variable_Example_4.b); // access using the class name

        Static_Variable_Example_4 obj= new Static_Variable_Example_4(); // access using create object and assing there value
                  obj.b=45;

                  System.out.println(b);

    }
}
