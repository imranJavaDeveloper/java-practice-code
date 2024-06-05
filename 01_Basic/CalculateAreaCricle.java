
import java.util.Scanner;

public class CalculateAreaCricle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("The area of the circle is: " + area);
            }
}
