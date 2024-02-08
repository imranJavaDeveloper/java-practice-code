
public class Lecture_03_setName extends Thread{
    public void run(){
        System.out.println("child method called");
    }

    public static void main(String[] args) {

        Lecture_03_setName obj= new Lecture_03_setName();
        obj.setName("child thread ");
        System.out.println(obj.getName());
          obj.start();

        Thread.currentThread().setName("furkan");
        System.out.println(Thread.currentThread().getName());
    }
}
