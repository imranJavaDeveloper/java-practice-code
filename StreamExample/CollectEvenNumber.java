
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectEvenNumber {
    public static void main(String[] args) {

        // create ArrayList

        ArrayList<Integer> list= new ArrayList<>();
        list.add(45);
        list.add(47);
        list.add(47);
        list.add(24);
        list.add(22);
        list.add(78);

        System.out.println(" print all list ");
        System.out.println(list);

        List<Integer> list2= list.stream().filter(i->i%2==0).collect(Collectors.toList());

        System.out.println("print all even number form the list ");
        System.out.println(list2);
    }
}
