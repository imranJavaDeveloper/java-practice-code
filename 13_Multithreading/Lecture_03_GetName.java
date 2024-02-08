
public class Lecture_03_GetName extends Thread{
    public void run(){
        System.out.println("child method");
    }

    public static void main(String[] args) {

        // create two object
        Lecture_03_GetName obj= new Lecture_03_GetName();
        Lecture_03_GetName obj2= new Lecture_03_GetName();

        // method public final String getName()

        System.out.println(obj.getName()); // Thread-0 default name set by the jvm
        System.out.println(obj2.getName()); // Thread-1 default name set by the jvm
        System.out.println(Thread.currentThread().getName());
    }
}