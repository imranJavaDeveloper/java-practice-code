import java.security.PublicKey;

public class GetName extends Thread {
    
    public void run(){
    
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
         
        GetName obj= new GetName();
        obj.setName("child thread");

        Thread.currentThread().setName("main thread ");
        System.out.println(Thread.currentThread().getName());
    }
}
