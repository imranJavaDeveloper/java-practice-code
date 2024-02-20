import java.util.function.*;

public class Predicate_Method {

    public static void main(String[] args) {

        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);

        Predicate<Integer> age= (j)-> j%2==0;

        // Calling Predicate method
        System.out.println(lesserthan.test(10)); // true
        System.out.println(age.test(45));  // false
    }
}
