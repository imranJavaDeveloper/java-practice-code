import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

        System.out.println("enter a number ");
        int number =sc.nextInt();
        int i;
          for( i=2;i<=number-1;i++){

            if (number/i==0) {
                 break;
            }
          } 
          if(i==number){
            System.out.println("number is prime :"+number);
          } 
          else{
            System.out.println("Number is not Prime :"+number);
          } 
            
    }
}
