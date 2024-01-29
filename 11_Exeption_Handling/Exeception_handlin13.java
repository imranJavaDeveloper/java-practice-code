
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exeception_handlin13 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println(" enter two number ");
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = a / b;
            System.out.println(" division is =" + c);

            int d = a + b;
            System.out.println("Addition =" + d);
        }catch (ArithmeticException ref){
            System.out.println("dempnatotro not be zero");
        }catch (InputMismatchException ref){
            System.out.println(" please input only digit not ");
        }
    }
}
