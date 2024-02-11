
import java.util.concurrent.*;

public class Callable_Exe {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable[] obj= {new MyCallable(10)};

        ExecutorService ser= Executors.newFixedThreadPool(1);

        // print
        for (MyCallable c : obj){
            Future f=ser.submit(c);
            System.out.println(f.get());

        }
           ser.shutdown();
    }
}
class MyCallable implements Callable{
    int num;
    // costructor
    MyCallable(int num){
        this.num=num;
    }

    @Override
    public Object call() throws Exception {

        System.out.println(Thread.currentThread().getName());
        int sum=0;
        for (int i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
}
