
public class Static_Variable_Example_3 {

    // create static variable
    static  int a=52;
    static String name;

    static  float blance=78.45f;
      public static void main(String[] args) {

          // Access static variable
          System.out.println(a); // direct use variable name inside static field
          System.out.println(Static_Variable_Example_3.blance);
          Static_Variable_Example_3 obj = new Static_Variable_Example_3();
                        obj.name="md imran alam";
                        System.out.println(name);

      }
}

