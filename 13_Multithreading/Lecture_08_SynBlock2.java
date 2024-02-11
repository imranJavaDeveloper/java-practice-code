
    public class Lecture_08_SynBlock2 {
        public static void main(String[] args) {

            furkan.Display2 fur= new furkan.Display2();
            furkan.MyThread2 t1= new furkan.MyThread2(fur,"imran");
            furkan.MyThread2 t2= new furkan.MyThread2(fur,"Atif");
            furkan.MyThread2 t3= new furkan.MyThread2(fur,"shahid");
            furkan.MyThread2 t4= new furkan.MyThread2(fur,"Adil");

            // one thread run 2 object at once time
            t1.start();
            t2.start();
            t3.start();
            t4.start();



        }
    }
    class Display3{
        public synchronized void wish(String name) throws InterruptedException {
            for (int i=0;i<=5;i++){
                System.out.println("good morning  "+name);
                Thread.sleep(10000);
                //System.out.println(name);
            }
        }
    }
    class MyThread3 extends Thread{
        furkan.Display2 d;
        String name;
        // constructor
        MyThread3(furkan.Display2 d, String name){
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

