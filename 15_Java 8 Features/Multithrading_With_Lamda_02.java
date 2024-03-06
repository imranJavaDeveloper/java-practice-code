package practice_progrma;

public class Multithrading_With_Lamda_02 {
    public static void main(String[] args) {

        Runnable r=()->{
            for (int i=0;i<5;i++){
                System.out.println("run method called");
            }
        };

        Thread t= new Thread(r);
        t.start();

        // main method called

        for (int i=0;i<5;i++){
            System.out.println("main method called ");
        }
    }
}
