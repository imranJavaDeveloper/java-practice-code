
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filterExample2 {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(98);
        list.add(35);
        list.add(88);
        list.add(55);
        list.add(66);
        list.add(33);
        list.add(82);

        // find the odd number form the list using
        List<Integer> list1= list.stream().filter(c->c%2!=0).collect(Collectors.toList());
        System.out.println(list1);
    }
}
