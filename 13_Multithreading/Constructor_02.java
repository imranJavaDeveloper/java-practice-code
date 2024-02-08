public class Constructor_02 implements Runnable{
    
    // run method override
    public void run(){
        System.out.println("run method called ");
    }
    public static void main(String[] args) {
        Runnable r= new Constructor_02();
         Thread t= new Thread(r);
         t.start();
         
         System.out.println("main method called ");
    }
}
