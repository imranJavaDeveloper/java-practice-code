

public class Lecture_07_SynBlock {
    public static void main(String[] args) {
        Display obj= new Display();
        MyThread t1= new MyThread(obj,"furkan");
        MyThread t2= new MyThread(obj,"imran");
        MyThread t4= new MyThread(obj,"Atif");
        MyThread t5=new MyThread(obj,"raja");

        t1.start();
        t2.start();
        t4.start();
        t5.start();

    }
}

class Display{
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi how are you  :" + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
class MyThread extends Thread{
    Display d;
    String name;
    // constructor
    MyThread(Display d, String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}
