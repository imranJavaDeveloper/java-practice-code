
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(45,21,5,66,59,999,6);
        List<Integer> list1=Arrays.asList(78,254,5669,48,6698,58);

        // use flat map

        List<List<Integer>> list3=new ArrayList<>();
            list3.add(list1);
            list3.add(list);

            List<Integer> list2= list3.stream().flatMap(x->x.stream().filter(y->y%2==0).collect(Collectors.toList());
    }
}
