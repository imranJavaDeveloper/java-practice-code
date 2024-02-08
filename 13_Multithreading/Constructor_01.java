public class Constructor_01 extends Thread {
    public void run(){
        System.out.println("thread running");
    }

    public static void main(String args[]){

        // defalut constructor of thread
        Constructor_01 obj= new Constructor_01();
        obj.start();
    }
}

