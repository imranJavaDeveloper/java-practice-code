
import java.lang.ref.PhantomReference;

public class Static_Method_Example_01 {
    private int id;
    private int age;
    private String name;
    private static String companyName="Amazon";
   public Static_Method_Example_01(int age,String name,int id){
       this.id=id;
       this.age=age;
       this.name=name;
   }
   //  create a method for display the output
    public void display(){
        System.out.println("id :"+id+"   Name :"+name+"  Age :"+age);

    }
    public static void display2(){
        System.out.println("Company Name :"+companyName);
    }
}

class Main{

    public static void main(String[] args) {
        // call static method

        Static_Method_Example_01.display2();
        System.out.println("all amazon employ name and age here");

        // create object of particular class
        Static_Method_Example_01 obj= new Static_Method_Example_01(45,"imran",101);
        obj.display();
        Static_Method_Example_01 obj2= new Static_Method_Example_01(36,"raja",102);
        obj2.display();
        Static_Method_Example_01 obj3= new Static_Method_Example_01(24,"Rahat Ali",103);
        obj3.display();

    }
}
