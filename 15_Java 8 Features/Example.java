
public class Example {

    public static void main(String[] args) {

        Runnable r= new Runnable() {
            @Override
            public void run() {

            }
        };

        Thread t= new Thread(r);
        t.start();

        System.out.println("main method called");
    }
}
