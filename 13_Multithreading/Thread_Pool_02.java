
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pool_02 {
    public static void main(String[] args) {

        MyThreadx[] arr={new MyThreadx("furkan",22),
                         new MyThreadx("rahat",24),
                         new MyThreadx("raja",26),
                         new MyThreadx("furkan",28)};

        // create a thread pool
        ExecutorService ser= Executors.newFixedThreadPool(4);

        // print all value
        for (MyThreadx x: arr){
            ser.submit(x);
        }
        ser.shutdown();


    }
}
class MyThreadx implements Runnable{
    String name;
    int age;

    // constructor
    MyThreadx(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void run(){

        System.out.println("hello :"+name+" "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}