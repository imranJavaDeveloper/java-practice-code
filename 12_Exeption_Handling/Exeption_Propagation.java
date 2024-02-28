
public class Exeption_Propagation {

    public static void main(String[] args) {

          // defaut execption handling
        doStuff();
        System.out.println(10/0);
    }
    public static void doStuff(){
        doMoreStuff();
        System.out.println("hi");

    }
    public static void doMoreStuff() {
          // some code
        System.out.printf("hello");
    }


}




