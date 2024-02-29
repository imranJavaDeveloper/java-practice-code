
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Throws_01 {
    public static void main(String[] args) throws FileNotFoundException {
        // Throws keyword used to declare the execption
        PrintWriter pw= new PrintWriter("hello");
        System.out.println("hello");
    }
}
