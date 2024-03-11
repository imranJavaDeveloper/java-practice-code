import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectOddNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

         list.add(45);
         list.add(78);
         list.add(25);
         list.add(44);
         list.add(66);
         list.add(22);
         list.add(23);
         list.add(33);
         list.add(75);
         list.add(99);
         list.add(78);

        System.out.println(" print all list element ");
        System.out.println(list);

        List<Integer> list2= list.stream().filter(i->(i%2)!=0).collect(Collectors.toList());


        System.out.println("print only odd number ");
        System.out.println(list2);
    }
}
