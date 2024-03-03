import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

        System.out.println("enter a number ");
        int number =sc.nextInt();
        
          for(int i=2;i<number;i++){

            if (number/i==0) {
                 break;
            }
          }   
            
    }
}
