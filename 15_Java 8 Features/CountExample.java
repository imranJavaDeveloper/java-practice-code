
import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(56,35,47,25,9);

        long number=list.stream().count();
        System.out.println(number);


        // another example

        List<String> list1= Arrays.asList("furkan","warner","imroz");

        long number2=list1.stream().count();
        System.out.println(number2);
    }
}
