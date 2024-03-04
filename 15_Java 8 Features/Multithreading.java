public class Multithreading  implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("run method called");
        }
    }
    
}

/**
 * InnerMultithreading
 */
 class main {
    public static void main(String[] args) {
        
        Multithreading obj= new Multithreading();
        Thread t= new Thread(obj);

        t.start();

        for(int i=0;i<5;i++){
            System.out.println("main method called");
        }

        // two thread run parrell
        // but i cant Accept 
    }
}
