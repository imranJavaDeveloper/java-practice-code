
import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Scanner is used for taking input from the user
        // calculate simple interest
        System.out.println("enter the principal balance ");
        float balance = sc.nextFloat();

        System.out.println(" enter the rate of interest");
        float interest=sc.nextFloat();

        System.out.println(" enter the time");
        float time= sc.nextFloat();

        float SI=(balance*interest*time)/100;

    System.out.println(" total interest ="+SI);
    }
}
