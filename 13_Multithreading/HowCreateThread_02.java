
public class HowCreateThread_02 extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("hello");
        }
    }
}
class Main1{
    public static void main(String[] args) {
        HowCreateThread_02 obj= new HowCreateThread_02();
          obj.start();
          for (int j=0;j<5;j++){
              System.out.println("md furkan alam");
          }
    }
}