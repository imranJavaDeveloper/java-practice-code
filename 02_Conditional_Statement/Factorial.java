import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

      System.out.println("enter number ");
        int number =sc.nextInt();

          int Fact =1;

          for(int i=0;i<=number;i++){
              Fact =Fact*i;

          }

          // Fcatorial 
          System.out.println("The Factorial : "+Fact);
    }
    
}
