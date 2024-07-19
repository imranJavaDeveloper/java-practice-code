
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(45);
        list.add(55);
        list.add(33);
        list.add(88);
        list.add(66);
        list.add(65);

//        List<Integer> list1= list.stream().limit(3).collect(Collectors.toList());
//        System.out.println(" print only limited value one two three");
//        System.out.println(list1);

        List<Integer> list1= list.stream().limit(5).collect(Collectors.toList());
        System.out.println(list1);
    }
}
