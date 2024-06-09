
import java.util.Scanner;

public class CalculateVolume {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        // WAP to input radius and height of a cylinder and calculate volume of cylinder. Volume=3.14*r*r*h

              System.out.println(" enter the radius ");
              int radius = sc.nextInt();

              System.out.println(" enter the height ");
              int height=sc.nextInt();

              double volume=3.14*radius*radius*height;

              System.out.println("volume of cylinder="+volume);
        }

}
