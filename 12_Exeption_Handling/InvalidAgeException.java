
import java.util.Scanner;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String s) {
        super(s);
    }


    // create a method for check you can give vote are not

     public static void vote(int age) throws InvalidAgeException {
        if (age<18){
            throw new InvalidAgeException("your age is under 18 ");
        }
        else {
            System.out.println("your age is :"+age);
            System.out.println("you can vote");
        }
    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age");
        int age= sc.nextInt();
try {
    vote(age);

} catch (InvalidAgeException e){
    System.out.println("your age is under 18");
    System.out.println("you can not give vote");
}


    }
}
