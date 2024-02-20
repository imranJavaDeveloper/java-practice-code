

public interface Default_Method {
    public void first();
    public void second();
    default public void third(){
        System.out.println("third method called");
    }
}
class main implements Default_Method{


    // but i can preform override of default method

    @Override
    public void first() {
        System.out.println("first method called ");
    }

    @Override
    public void second() {
        System.out.println("second method called");

    }
    public static void main(String[] args) {
        main ob= new main();
        ob.first();
        ob.second();
        ob.third();
    }


        /* the benefit of default method will we not override in child class */
}
