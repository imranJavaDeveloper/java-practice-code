
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // conditional statement

        System.out.println(" enter your age ");
        int age = sc.nextInt();

        // check your age is under 18 or above 18

        if(age>18){
            System.out.println(" your age is above 18 ="+age);

            // what type of work you can do
            System.out.println("you can drive");
            System.out.println("you can vote ");
            System.out.println(" you make passport");
        }
        else {
            System.out.println(" your age is under 18 ="+age);
            // what type of work  not you can do
            System.out.println("you can not drive");
            System.out.println("you can not vote ");
            System.out.println(" you make not passport");
        }



    }
}
