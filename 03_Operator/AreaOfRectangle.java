import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        
        System.out.println("enter the length");
        int length=sc.nextInt();

        System.out.println("enter the width");
        int width=sc.nextInt();

        float area=length*width;

        System.out.println(" the Area of the rectangle ="+area);
    }
}
