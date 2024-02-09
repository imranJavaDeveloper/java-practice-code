
public class Lecture_05_Yeild extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("hello");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        Lecture_05_Yeild obj= new Lecture_05_Yeild();
           obj.start();
           for (int j=0;j<5;j++){
               System.out.println(j);
           }

           // first run main method than child method
           // Reason is yield method stop the current execution of the method
    }
}
