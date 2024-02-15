
public class Constructor_Chaining {

    Constructor_Chaining() {
        this(5);
        System.out.println();
    }
    Constructor_Chaining(int x){

        this(5,6);
        System.out.println("parametrized constructor called");
    }
    Constructor_Chaining(int x,int y){
        System.out.println(x*y);
    }

    // create object
    public static void main(String[] args) {
        Constructor_Chaining obj= new Constructor_Chaining();
        Constructor_Chaining obj2= new Constructor_Chaining(5);

        Constructor_Chaining obj3= new Constructor_Chaining(10,5);
    }
}
