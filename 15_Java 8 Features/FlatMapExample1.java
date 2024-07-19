
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample1 {
    public static void main(String[] args) {

        // first ArrayList
        ArrayList<Integer> list= new ArrayList<>();
        list.add(55);
        list.add(98);
        list.add(22);
        list.add(58);

        // second ArrayList
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(87);
        list1.add(66);
        list1.add(33);


        // add two Arraylist in single ArrayList

        List<List<Integer>> list2= new ArrayList<>();
           list2.add(list1);
           list2.add(list);

        // print all Arraylist into single list

        List<Integer> list3=list2.stream().flatMap(x->x.stream().filter(p->p%2==0)).collect(Collectors.toList());
        System.out.println(list3);


    }
}
