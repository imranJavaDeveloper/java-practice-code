
public class Static_block {
    // create a constructor

    public Static_block(){
        System.out.println(" first constructor block called");
    }

    public Static_block(String s){
        System.out.println("second constructor called");
    }

    // create first static block called
    static {
        System.out.println(" first static block called ");
    }
    // create second static block called
    static {
        System.out.println(" second static block called ");
    }
    // third static block called
    static{
        System.out.println("  third static block called ");
    }


    public static void main(String[] args) {
        Static_block obj= new Static_block();
        Static_block obj2= new Static_block("imran");

    }
}
