public class setName extends Thread {

    // run() method
    public void run(){
        System.out.println("run method called");
    }
    public static void main(String[] args) {
        // set thread name
        setName obj= new setName();
        obj.setName("child thread first");
         setName obj2=new setName();
         obj2.setName("child thread second");

         Thread.currentThread().setName("furkan");
         
         // get all thread name one by one 
           System.out.println(Thread.currentThread().getContextClassLoader());
           System.out.println(obj.getName());
           System.out.println(obj2.getName());
    }
}
