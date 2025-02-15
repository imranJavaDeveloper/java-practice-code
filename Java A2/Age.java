
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your Age");
        int age= sc.nextInt();

        if (age<18){
            System.out.println("you must be at least 18 years old to donate blood");
        } else if (age>=18) {
            System.out.println("Enter your Weight ");
            float weight=sc.nextFloat();
            if (weight<50.0){
                System.out.println("you must weight at least 50 kilograms to donate blood");
            }
            else if (weight>=50.0){
                System.out.println("your are can donate blood");
            }
        }
    }
}


