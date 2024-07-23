
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {

        List<Integer> number= Arrays.asList(45,24,89,55,66,23,21,45);

        // collect even number

        List<Integer> evenNumber=number.stream().filter(i->i%2==0).collect(Collectors.toList());

        System.out.println(evenNumber);
    }
}
