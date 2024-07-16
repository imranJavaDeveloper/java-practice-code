

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println(" enter a number ");
        int number=sc.nextInt();

        String result=(number%2==0)?"Number is even":" Number is odd";
        System.out.println(result+":"+number);
    }
}
