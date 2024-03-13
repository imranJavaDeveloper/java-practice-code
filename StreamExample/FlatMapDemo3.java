
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo3 {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(45);
        list.add(55);
        list.add(24);

        ArrayList<Integer>list1= new ArrayList<>();
        list1.add(22);
        list1.add(86);
        
        //Add to string into the single list
        
        List<List <Integer>> list2= new ArrayList<>();
          list2.add(list1);
          list2.add(list);


          List<Integer> list3= list2.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(list3);
    }
}
