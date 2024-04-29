import java.util.Scanner;
public class SumTwoNumber {
    public static void main(String[] args) {
        
        // sum of two number 
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number ");

        int firstNumber=sc.nextInt();


        System.out.println("enter second number ");
        int secondNumber =sc.nextInt();

        int third=firstNumber+secondNumber;

        System.out.println("the sum of two number : "+third);
    }
}
