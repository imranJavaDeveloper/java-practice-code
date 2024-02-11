
import java.util.Scanner;
import java.util.concurrent.*;

public class Callable_Exe2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable2 [] obj= {new MyCallable2(5)};

        ExecutorService se= Executors.newFixedThreadPool(1);
        for (MyCallable2 c: obj){
            Future f= se.submit(c);
            System.out.println(f.get());
        }
        se.shutdown();
    }
}
 class MyCallable2 implements Callable<Integer> {

    int num;

     public MyCallable2(int num) {
         this.num=num;

     }


     public Integer call() {

         System.out.println(" number :"+num);
         System.out.println("multiplication ");


         int mul=1;

         for (int i=1;i<=5;i++){
             mul=mul*i;

         }
         return mul;
     }

 }