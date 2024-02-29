
import java.io.InterruptedIOException;

public class Throws_02 {
    public static void main(String[] args) throws InterruptedException {

        // i can handle this Exception try and catch and throws keyword
        Thread.sleep(2000);

    }

}
class Main2 extends Thread{

    public void run(){
        System.out.println("hello");
        try{
            Thread.sleep(200);
        }catch (InterruptedException e){
            System.out.println();
        }


        // this is the way to handle exception using try catch and throws
    }
}
