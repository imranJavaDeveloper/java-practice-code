

public class ConsChainging {


    public ConsChainging() {

        this(10);
        System.out.println("Default Constructor Called");
    }

    public ConsChainging( int a) {
        System.out.println("Parametrized Constructor Called");
    }

    public static void main(String[] args) {

        // create object of this  class


        ConsChainging obj= new ConsChainging();

        /* Output *
        * Parametrized Constructor Called
         Default Constructor Called*/
    }
}
