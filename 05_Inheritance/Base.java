

public class Base {
    
    // Create a method
    public  void first(){
        System.out.println("base class method called");
    }

    
}
class Drived extends Base{
    // create second method
    public   void second(){
        System.out.println("Drived class method called");
    };
}

class Main{
    public static void main(String[] args) {
        Drived obj= new Drived();
        //call parent calss method 
        obj.first();
    }
}
