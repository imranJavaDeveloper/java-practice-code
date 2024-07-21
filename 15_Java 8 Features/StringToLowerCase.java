
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToLowerCase {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("IMRAN","FURKAN","SHAHID","ARMAN","IBRAR");

        List<String> lowercase=list.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("print all string into lowercase");

        System.out.println(lowercase);
        System.out.println("thank you");





    }
}
