package Encapsulation;

public class Example {

    public void m1(){
        System.out.println("1 example called");
    }
}
class Example_02 extends Example{
    public void m1(){
        System.out.println("02 example called");
    }
}
class Example_03 extends Example_02{
    public void m1(){
        System.out.println("03 example called ");
    }
}
class Main_Check{
    public static void main(String[] args) {

        Example_03 obj= new Example_03();
        obj.m1();
        System.out.println("thank you");
    }
}
