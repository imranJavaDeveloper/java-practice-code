
import java.util.function.Predicate;

public class Predicate_Example_02 {
    public static void main(String[] args) {

        // check age is greater  than 18 ya less than 18


        Predicate<Integer>  age= (i)-> (i<18);

        System.out.println(age.test(10)); // true


    }
}
