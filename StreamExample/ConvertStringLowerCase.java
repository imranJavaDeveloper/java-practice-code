
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringLowerCase {
    public static void main(String[] args) {

        // create String ArrayList
        List<String> list= Arrays.asList("imran","frukan","Rohit");

        System.out.println("print the string into upper case");
        List<String> list2= list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        //print all string in the Upper case
        System.out.println(list2);


        System.out.println("print string which length is upper five");
        // print string which length is upper 5
        List<String> list3=list.stream().filter((x-> x.length()>5)).collect(Collectors.toList());
        System.out.println(list3);

    }
}
