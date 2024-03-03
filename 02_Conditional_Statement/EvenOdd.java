import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        // check number is even or odd

        System.out.println("enter number ");
        int number= sc.nextInt();

         if (number%2==0) {
              System.out.println("Number is Even :"+number);

         }
         else{
            System.out.println("Number is Odd :"+number);
         }
    }
    
}
