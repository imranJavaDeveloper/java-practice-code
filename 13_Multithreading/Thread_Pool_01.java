

import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pool_01 {
    public static void main(String[] args) {

        // create thread pool
        MyRunnbale[] obl={new MyRunnbale("furkan"),
                          new MyRunnbale("imran"),
        };


        // ExecutorService service
        ExecutorService service = Executors.newFixedThreadPool(1);

        // print one by one
        for (MyRunnbale b :obl){
            service.submit(b);
        }
        service.shutdown();
    }
}
class MyRunnbale implements Runnable{
    String name;

    MyRunnbale(String name){
        this.name=name;
    }

    public void run(){
        System.out.println(name+" job start by thread "+Thread.currentThread().getName());
        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" job completed by Thread "+Thread.currentThread().getName());
    }
}
