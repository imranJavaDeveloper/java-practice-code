
public class Start_Method_02 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread called");
        }
    }
}
class MainThread2{
    public static void main(String[] args) {
         Run_Method_02 obj= new Run_Method_02();

             // create new thread when we call start method

                  obj.start();
                  for (int i=0;i<5;i++){
                  System.out.println("main thread called");

            /* we can not except in which thread should run first its depend on thread scheduler*/
        }
    }
}

