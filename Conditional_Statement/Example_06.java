import java.util.Scanner;

public class Example_06 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println(" enter a month number");
        int number =sc.nextInt();

        switch (number) {
            case 1:
                 System.out.println("January  31 Days");
                break;
        case 2:
        System.out.println("February t28/29 Days");
               break;
        case 3:
        System.out.println("March 31 Days");
              break;
        case 4:
        System.out.println("April 30 Days");
              break;
        case 5:
        System.out.println("May 31 Days");
              break;
        case 6:
        System.out.println("June 30 Days");
              break;
        case 7:
        System.out.println("July 31 Days ");
              break;
        case 8:
        System.out.println("August 31 Days");
              break;
        case 9:
        System.out.println("September 30 Days");
             break;
        case 10:
        System.out.println("October 31 Days");
             break;
        case 11:
        System.out.println("November 30 Days");
             break;
        case 12:
        System.out.println("December 31 Dyas");
             break;
            default:
            System.out.println("input wrong month number");
                break;
        }
    }
}

