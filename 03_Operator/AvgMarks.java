
import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //WAP to Input 5 subject marks of a student and find total marks and percentage obtained by the student.

        System.out.println("enter hindi subject marks");
        int hindi=sc.nextInt();

        System.out.println("enter english subject marks");
        int english=sc.nextInt();

        System.out.println("enter urdu subject marks");
        int urdu=sc.nextInt();

        System.out.println("enter math subject marks");
        int math=sc.nextInt();

        System.out.println("enter science subject marks");
        int science=sc.nextInt();

        int totalMarks=hindi+english+math+urdu+science;
        System.out.println(" total marks ="+totalMarks);


    }
}
