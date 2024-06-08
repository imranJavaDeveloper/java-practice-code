
import java.util.Scanner;
public class CalculateSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // calculate square
        System.out.println("entar number ");
        int number=sc.nextInt();

        int square=number*number;
        System.out.println(" Number :"+number);
        System.out.println(" Square of Given Number :"+square);
    }
}
