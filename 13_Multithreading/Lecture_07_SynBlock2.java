
public class Lecture_07_SynBlock2 {
    public static void main(String[] args) {

        Display2 fur= new Display2();
        MyThread2 t1= new MyThread2(fur,"imran");
        MyThread2 t2= new MyThread2(fur,"Atif");
        MyThread2 t3= new MyThread2(fur,"shahid");
        MyThread2 t4= new MyThread2(fur,"Adil");

        // one thread run 2 object at once time
        t1.start();
        t2.start();
        t3.start();
        t4.start();



    }
}
class Display2{
   public void wish(String name) throws InterruptedException {
       for (int i=0;i<=5;i++){
           System.out.println("good morning  "+name);
           Thread.sleep(1000);
           //System.out.println(name);
       }
   }
}
class MyThread2 extends Thread{
    Display2 d;
    String name;
    // constructor
    MyThread2(Display2 d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        try {
            d.wish(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
