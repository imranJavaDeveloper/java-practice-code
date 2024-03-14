
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        // first ArrayList
        ArrayList<Integer> list= new ArrayList<>();
           list.add(78);
           list.add(25);
         // Second ArrayList
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(55);
        list1.add(78);

        List<List<Integer>> list2= Arrays.asList(list,list1);
        System.out.println(list2); // [[78, 25], [55, 78]]

        // use flat map
        // print all ArrayList in single list
        List<Integer> list3=list2.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
        System.out.println(list3);//[78, 25, 55, 78]  add 10 in all element [88, 35, 65, 88]

    }
}
