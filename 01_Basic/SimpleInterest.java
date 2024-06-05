import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the principal");
        int pi=sc.nextInt();

        System.out.println("enter the rate of interest");
        int rateOfInterest=sc.nextInt();

        System.out.println("ente the time");
         int time= sc.nextInt();

         float si= (pi*rateOfInterest*time)/100;
         System.out.println("total interest :"+si);
    }

}
