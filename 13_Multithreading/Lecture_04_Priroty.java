
public class Lecture_04_Priroty extends Thread{

    public void run(){
        System.out.println("child method ");
    }

    public static void main(String[] args) {

        // create object
        Lecture_04_Priroty obj= new Lecture_04_Priroty();
        Lecture_04_Priroty obj2= new Lecture_04_Priroty();
        Lecture_04_Priroty obj3= new Lecture_04_Priroty();

        // default priority priority give by jvm 5
        // wen can get any thread priority using method getPriority()

        // first thread priority
        System.out.println("priority of first thread :"+obj.getPriority());

        // second thread priority
        System.out.println("priority of second thread :"+obj2.getPriority());

        // third priority
        System.out.println("priority of third thread :"+obj3.getPriority());

    }
}
