
import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter integer number");
        int n=sc.nextInt();

        if (n%2!=0){
            System.out.println("Wired");
        }
        else if (n%2==0 && n>=2 || n<=5){
            System.out.println("not Wired");
        }

        else if (n%2==0 && n>=6 || n<=20){
            System.out.println("Wired");
        } else if (n%2==0) {
              if (n>20)
            System.out.println("not wired");
        }

    }
}
