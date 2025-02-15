
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter total income");
        double totalIncome = sc.nextDouble();

        double tax;

        if (totalIncome <= 250000) {
            System.out.println("Your Total Income :" + totalIncome);
            System.out.println("Not Tax");
            System.out.println("After the tax your income");
        }

       else if (totalIncome >= 250001 && totalIncome<=500000) {
            System.out.println("Your Total Income :" + totalIncome);
            tax = totalIncome * 5 / 100;
            System.out.println("Tax"+tax);
            System.out.println("After the tax your income");
            System.out.println(totalIncome-tax);
        }


        else if (totalIncome >= 500001 && totalIncome<=1000000) {
            System.out.println("Your Total Income :" + totalIncome);
            tax = totalIncome * 20 / 100;
            System.out.println("Tax"+tax);
            System.out.println("After the tax your income");
            System.out.println(totalIncome-tax);
        }



        else if (totalIncome>=1000000) {
            System.out.println("Your Total Income :" + totalIncome);
            tax = totalIncome * 30 / 100;
            System.out.println("Tax"+tax);
            System.out.println("After the tax your income");
            System.out.println(totalIncome-tax);
        }
    }
}
