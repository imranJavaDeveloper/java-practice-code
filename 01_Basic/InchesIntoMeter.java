
import java.util.Scanner;

public class InchesIntoMeter {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        // convert inches into meter

        System.out.println("enter inches");
        int inches=sc.nextInt();
        //  inches into meter
        double meter=(inches * 0.0254 );
        System.out.println("total meter of five inches :"+meter);


    }

}
