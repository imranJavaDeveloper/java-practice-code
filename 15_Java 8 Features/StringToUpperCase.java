
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("i love java programing my best language");

        List<String> uppercase=list.stream().map(String::toUpperCase).collect(Collectors.toList());



    }
}
