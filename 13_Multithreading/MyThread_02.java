

public class MyThread_02 {
    public void run(){
        System.out.println("child class method");
    }
}

class Test{
    public static void main(String[] args) {

        // creating thread class object
        MyThread_02 obj= new MyThread_02();
        System.out.println(Thread.currentThread().getName());

        MyThread t= new MyThread();
        System.out.println(t.getName());

        // i can set name of thread method explicitly
        // change main thread name called =="imran";
        Thread.currentThread().setName("imran");
        System.out.println(Thread.currentThread().getName());

        // what is hashing collision
        /*  what is hashing collision in java :- when two or more key produce same key point the same bucket or location is called  hashing collision in java */
    }
}
