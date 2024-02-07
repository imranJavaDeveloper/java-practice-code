
public class Run_Method_Overloading_02 extends Thread{

    // Preform Run Method Overloading

    public void run(){
        System.out.println("no argument method called");
    }

    public void run(int i){
        System.out.println(" argument method called");
    }
}

class Main_{
    public static void main(String[] args) {


        Run_Method_Overloading_02 obj= new Run_Method_Overloading_02();
            // No Argument Run method called when we call start method
            obj.start();

            // Argument Run method called Explicitly
            obj.run(5);

        System.out.println(" main method called ");


    }
}
