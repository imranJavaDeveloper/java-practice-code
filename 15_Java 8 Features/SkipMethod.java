
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SkipMethod {
    public static void main(String[] args) {

        // find even number form the list
        List<Integer> list= new ArrayList<>();
        list.add(78);
        list.add(26);
        list.add(98);
        list.add(32);
        list.add(33);
        list.add(77);

//        List<Integer> list1= list.stream().filter(x->x%2==0).collect(Collectors.toList());
//        System.out.println(list1);

//       List<Integer>list1= list.stream().filter(x->x%2==0).skip(1).collect(Collectors.toList());
//        System.out.println(list1);

     List<Integer>list1= list.stream().skip(1).collect(Collectors.toList());
        System.out.println(list1);
    }
}
