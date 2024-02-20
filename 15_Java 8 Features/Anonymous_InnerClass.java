
public class Anonymous_InnerClass {
    /* the mai Advantages of Anonymous class will not create a seprate  class
    *  for implement interface method
    *  1. Anonymous class implement multiple Abstract method
    *  2. Functional interface override only one abstract method*/
    public static void main(String[] args) {

      Runnable r= new Runnable() {
          @Override
          public void run() {
              for (int i=0;i<5;i++){
                  System.out.println("run method called ");
              }
          }
      }  ;

      Thread t= new Thread(r);
      t.start();
         //r.run(); call just like a normal method


      for (int i=0;i<5;i++){
          System.out.println(" main thread called");
      }


    }
}
