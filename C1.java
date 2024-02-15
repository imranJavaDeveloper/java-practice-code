package Encapsulation;

public class C1 {
    int x=50;
}
class C2 extends C1{
    int x=40;
}
class Check{
    public static void main(String[] args) {

        C2 obj= new C2();
        System.out.println(obj.x);//40

        C1 obj2= new C1();// 40
        System.out.println(obj2.x);//50

        C1 obj3= new C2();

        System.out.println(obj3.x);//50


    }
}