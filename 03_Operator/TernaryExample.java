import java.util.Scanner;

public class TernaryExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

      // check Number is divisible by 5 OR Not
    
        System.out.println("enter a number ");
        int number =sc.nextInt();

        //use ternary Operator for check the condition

        String name=(number/5==0)?"Number is divisible by 5":"Number is not divisible by 5 ";

        System.out.println(name);
    }
}
