
public class Test2 {

    public  static void m1(){
        System.out.println("parent class method called");
    }
}
class child extends Test2{

    public static void m1(){
        System.out.println("child class method called");
    }
}

class  Main {

    public static void main(String[] args) {

       child obj= new child();
        obj.m1();
        obj.m1();
    }
}
