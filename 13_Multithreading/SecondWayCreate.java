public class SecondWayCreate  implements Runnable {
   
    // run method
    public void run(){
        System.out.println(" hi Imran");
    }
}
/**
 * InnerSecondWayCreate
 */
 class InnerSecondWayCreate {
public static void main(String[] args) {
    
    SecondWayCreate obj= new SecondWayCreate();
    
    // create a thread and pass its ref of class in htread
    Thread t1= new Thread(obj);
          t1.start();
          System.out.println(" hi furkan");
          System.out.println("thank you");

}
    
}
