public class Test {

     public void m1(){
        System.out.println("parent class method called");
    }
    
}

class child extends Test{

    public void m2(){
        System.out.println("child class method called");
    }
}


class  Main {

    public static void main(String[] args) {

        child obj= new child();
        obj.m2();
        obj.m1();
    }
}



