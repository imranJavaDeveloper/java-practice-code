

public class Base {
<<<<<<< HEAD
    
    // Create a method
    public  void first(){
=======
    public void m1(){
>>>>>>> parent of 123adf2 (Update Base.java)
        System.out.println("base class method called");
    }

    
}
class Drived extends Base{
<<<<<<< HEAD
    // create second method
    public   void second(){
=======
    public void m1(){
>>>>>>> parent of 123adf2 (Update Base.java)
        System.out.println("Drived class method called");
    };
}

class Main{
    public static void main(String[] args) {
        Drived obj= new Drived();
        obj.first();
    }
}
