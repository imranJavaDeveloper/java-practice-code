

public class Base {
    
    // create m1 method
    public void m1(){
        System.out.println("base class method called");
    }

    
}
class Drived extends Base{
    // override m1 method
    public void m1(){
        System.out.println("Drived class method called");
    };
}

class Main{
    public static void main(String[] args) {
        Drived obj= new Drived();
        obj.m1();
    }
}
