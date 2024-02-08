public class Constructor_04 implements Runnable{
    public void run(){
        System.out.println(" now thread calling ");
    }
    public static void main(String[] args) {
        
        Runnable r= new Constructor_04();
          Thread t= new Thread(r,"main thread called");
          t.start();

          String name=t.getName();
          System.out.println(name);
    }
}
