package practice_progrma;

public class Multithrading_With_Lamda {
    public static void main(String[] args) {

        Runnable r=()-> System.out.println("hello");

        Thread t= new Thread(r);
        t.start();

        // main method called

        System.out.println("main method called ");
    }
}
