package Operator;

import java.util.Scanner;

/**
 * Airthmetic_Operator
 */
public class Airthmetic_Operator {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println(" enter the two number");
        int frist_Number=sc.nextInt();
        int second_Number=sc.nextInt();
         // addition of the two number

        int add=frist_Number+second_Number;
        System.out.println("Addition ="+add);

        // subtraction of the two number
        int sub=frist_Number-second_Number;
        System.out.println("subtraction ="+sub);

        // multiplication of the two number
        int mul=frist_Number*second_Number;
        System.out.println(" multiplication="+mul);

        // division of the two number
        int div=frist_Number/second_Number;
        System.out.println(" division="+div);

        //Modulo division 
        int modulo=frist_Number%second_Number;
        System.out.println("modulo division="+modulo);

    }
}