

public class Lecture_06_Join_Sleep extends Thread{
    static Thread mt;
    public void run(){
        System.out.println("child thread called");

        try {
            mt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Lecture_06_Join_Sleep.mt=Thread.currentThread();

        Lecture_06_Join_Sleep obj= new Lecture_06_Join_Sleep();
        obj.start();
        for (int i=0;i<5;i++){
            System.out.println("main thread called");
        }
        Thread.sleep(1000);
    }
      // 1. first run main method
      // 2. second run child method
}
