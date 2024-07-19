
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample2 {
    public static void main(String[] args) {

        // first ArrayList

        ArrayList<Integer> list1= new ArrayList<>();

        list1.add(45);
        list1.add(45);
        list1.add(5);
        list1.add(95);
        list1.add(25);


        // second arraylist

        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(45);
        list2.add(32);
        list2.add(98);
        list2.add(22);

        // third Arraylist

        ArrayList<Integer> list3= new ArrayList<>();
        list3.add(65);
        list3.add(45);
        list3.add(62);

        // add all Arraylist into single arrayList

        List<List<Integer>> list= new ArrayList<>();
        list.add(list3);
        list.add(list2);
        list.add(list1);

        // print all ArrayList

        List<Integer> list4=list.stream().flatMap(x->x.stream().distinct()).collect(Collectors.toList());

        System.out.println(list4);
    }
}
