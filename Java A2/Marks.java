package JAVA_A2;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter hindi marks");
        int hindi=sc.nextInt();

        System.out.println("enter english marks");
        int english=sc.nextInt();

        System.out.println("enter math marks");
        int math=sc.nextInt();

        System.out.println("enter physics marks");
        int physics=sc.nextInt();

        System.out.println("enter Chemistry marks");
        int chemistry=sc.nextInt();

        int totalMarks=hindi+english+physics+chemistry+math;
        System.out.println("Total Marks ="+totalMarks);

        int percentage=totalMarks/5;
        System.out.println("your Percentage ="+percentage);

        /** Condition */

        if (percentage==85 || percentage>85){
            System.out.println("Excellent");
        }

       else if (percentage==70 || percentage>70 && percentage<85){
            System.out.println("Very Good");
        }

        else if (percentage==55 || percentage>55 && percentage<70){
            System.out.println(" Good");
        }


         else if (percentage==40 || percentage>40 && percentage<55){
            System.out.println("Poor");
        }
        else{
            System.out.println("Very Poor");
        }
    }
}
