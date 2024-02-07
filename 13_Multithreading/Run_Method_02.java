
public class Run_Method_02 extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("child thread called");
        }
    }
}

class MainThread{
    public static void main(String[] args) {
        Run_Method_02 obj= new Run_Method_02();
        // run method execute like Normal method And no Thread will Create
        obj.run();
         for (int i=0;i<5;i++){
             System.out.println("main thread called");

             /* Always come first child method  than After main Method  called*/
         }
    }
}