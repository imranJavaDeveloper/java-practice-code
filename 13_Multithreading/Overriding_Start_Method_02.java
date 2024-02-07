
public class Overriding_Start_Method_02 extends  Thread{

    public void start(){
        System.out.println("start method called");
    }
    public void run(){
        System.out.println("run method called");
    }
}
class Main03{
    public static void main(String[] args) {

        Overriding_Start_Method_02 obj= new Overriding_Start_Method_02();


         obj.start();

        System.out.println("Main method called ");
    }

}
