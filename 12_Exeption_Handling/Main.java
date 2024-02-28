

import java.util.Scanner;

public class Main  extends Exception{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter your age");
        int age=sc.nextInt();
        if(age<18){
           // throw new InvalidAgeException();
        }
    }
}
