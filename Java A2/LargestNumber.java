
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter first number");
        int firstNumber=sc.nextInt();

        System.out.println("enter second number");
        int secondNumber=sc.nextInt();


        System.out.println("enter third number");
        int thirdNumber=sc.nextInt();


        System.out.println("enter four number");
        int fourNumber=sc.nextInt();

        if (firstNumber>secondNumber && firstNumber>thirdNumber && firstNumber>fourNumber){
            System.out.println("First Number is Largest Number :"+firstNumber);
        }
        else if (secondNumber>firstNumber && secondNumber>thirdNumber && secondNumber>fourNumber){
            System.out.println("Second Number is Largest Number :"+secondNumber);
        }

        else if (thirdNumber>firstNumber && thirdNumber>secondNumber && thirdNumber>fourNumber){
            System.out.println("Third NUmber is largest Number :"+thirdNumber);
        }
        else {
            System.out.println("Fourth Number is Largest:"+fourNumber);
        }
    }
}
