
import java.util.Arrays;
import java.util.List;

public class RemoveNull {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("furkan","car",null,"bmw","laptop",null);

        // i want to remove null form the list


        //list.stream().filter(z->z!=null).forEach(System.out::println);
        list.stream().distinct().forEach(System.out::println);
    }
}
