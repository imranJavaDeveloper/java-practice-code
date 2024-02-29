
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Throws_01 {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw= new PrintWriter("hello");
        System.out.println("hello");
    }
}
