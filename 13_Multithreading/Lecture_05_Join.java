
public class Lecture_05_Join extends Thread{
    public void run(){
        System.out.println("child method called ");
    }

    public static void main(String[] args) throws InterruptedException {
        Lecture_05_Join obj= new Lecture_05_Join();
        obj.start();
        // main will have to wait until comp child thread
        obj.join();
        System.out.println("main method called");
        // first run child thread
        // second run main method
    }
}
