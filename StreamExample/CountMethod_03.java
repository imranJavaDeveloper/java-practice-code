
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountMethod_03 {
    public static void main(String[] args) {

        // create string Arraylist
        List<String> list= Arrays.asList("md imran alam","md furkan alam","md raja alam","md shahid ali");

        List<String> list2=Arrays.asList("md adil alam","md sharukh alam");

        // check how many string object present
        Long list1=list.stream().count();
        System.out.println(list1);

        List<List<String>> list3=Arrays.asList(list,list2);

        List<String> list4=list3.stream().flatMap(x->x.stream()).collect(Collectors.toList());

        System.out.println(list4);
    }
}
