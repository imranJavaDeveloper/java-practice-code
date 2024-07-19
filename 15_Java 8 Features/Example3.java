
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(45);
        list.add(87);
        list.add(22);
        list.add(65);
        list.add(22);

        List<Integer> list1= list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
    }
}
