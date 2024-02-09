
public class Lecture_04_SetPriroty extends Thread {

    public void run(){
        System.out.println("child thread");
    }

    public static void main(String[] args) {

        // set Priority of thread
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

        // create object
        Lecture_04_SetPriroty th= new Lecture_04_SetPriroty();
        Lecture_04_SetPriroty th2= new Lecture_04_SetPriroty();
        Lecture_04_SetPriroty th3= new Lecture_04_SetPriroty();

        // all child class thread Priority is 10 by default 10
        // all thread Priority will be by default 10
        // first thread Priority
           // th.setPriority(6);
        System.out.println("first thread :"+th.getPriority());

        // second  thread Priority
        System.out.println("second thread :"+th2.getPriority());

        // third thread Priority
        System.out.println("third thread :"+th3.getPriority());


        th.setPriority(8);
        th2.setPriority(5);
        th3.setPriority(6);

        System.out.println("After set the thread Priority ");
        System.out.println(th.getPriority());
        System.out.println(th2.getPriority());
        System.out.println(th3.getPriority());
    }
}
