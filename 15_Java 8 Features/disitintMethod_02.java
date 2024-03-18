
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class disitintMethod_02 {
    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(45,12,55,48,58,585,568,55,77,9655,66,558);
        // remove duplicate value
        List<Integer> list1=list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("md imran alam");
        list2.add("md frukan alam");
        list2.add("md raja alam");
        list2.add("md Adil alam");
       
        // print the name some natural sorting order 
        // sorted() method preform nautal sorting order
        List<String> list3=list2.stream().sorted().collect(Collectors.toList());
        System.out.println(list3);

    }
}
