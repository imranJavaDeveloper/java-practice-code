
public class Lecture_05_Yeild2 extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("hello");
            //yield () stop the current execution of the program
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        Lecture_05_Yeild2 obj= new Lecture_05_Yeild2();
           obj.start();

           // first run main method
           for (int j=0;j<5;j++){
               System.out.println(j);
           }

           // if I am not using yield method  mixed output will come
           // if I am using the yield method  execute method one by one
    }
}
