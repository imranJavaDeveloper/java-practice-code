
public class DeadLockExampleA {
    public synchronized void d1(B b){

        System.out.println("thread 1 starts execution of d1 method()");

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("thread 1 trying to call B class last ()");
            b.last();
        }
    }
    public synchronized void last(){
        System.out.println("inside a this is last method");
    }
}

class B{
    public synchronized void d2(DeadLockExampleA a){
        System.out.println("thread 2 starts execution of d2()");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Thread 2 tyring to call a clasas last method")
            ;
            a.last();
        }

    }
    public synchronized void last(){
        System.out.println("inside B this is lat method");
    }
}

class DeadLock1 extends Thread{

    DeadLockExampleA a= new DeadLockExampleA();
    B b=new B();
    public void m1(){
        this.start();
        a.d1(b);

    }
    public void run(){
        b.d2(a);

    }

    public static void main(String[] args) {

        DeadLock1 d= new DeadLock1();
        d.m1();
    }
}
