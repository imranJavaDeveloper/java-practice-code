

public class Anonymous_Lambda {
    public static void main(String[] args) {
        /* which is good Anonymous class ye Lambda Expression
        * both are good as per situation
        * 1. Anonymous class can override two or more abstract method
        * 2. Lambda Expression can override only one abstract method */
        Runnable r=()->{
            for (int i=0;i<5;i++){
                System.out.println("child thread called ");
            }
        };

        Thread t= new Thread(r);
        t.start();

        for (int j=0;j<5;j++){
            System.out.println("main thread called");
        }
    }
}
