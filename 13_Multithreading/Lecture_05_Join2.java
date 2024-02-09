
public class Lecture_05_Join2 extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("child thread called");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Lecture_05_Join2 obj= new Lecture_05_Join2();
         obj.start();

         // main thread only 10 second after than it will run
         obj.join(10000);
        for (int i=0;i<10;i++){
            System.out.println("main thread called");
        }
    }
}
