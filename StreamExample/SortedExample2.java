
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample2 {
    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<>();
        list.add(78);
        list.add(89);
        list.add(90);
        list.add(78);
        list.add(55);
        list.add(78);
        list.add(42);


        // 1 way
        System.out.println("first way decending order sorting ");
        Comparator<Integer> com=(I1, I2)->(I1<I2)?1:(I1>I2)?-1:0;
        List<Integer> list1=list.stream().sorted(com).collect(Collectors.toList());
        // print the Array list with decending  order sorting
        System.out.println(list1);

        // 2 way
        System.out.println("Second way decending order sorting ");
        List<Integer> list2=list.stream().sorted((I1,I2)->-I1.compareTo(I2)).collect(Collectors.toList());
        // print the Array list with assecnd order sorting
        System.out.println(list2);


        // 3 way
        System.out.println("third  way decending order sorting ");
        List<Integer> list3=list.stream().sorted((I1,I2)->I2.compareTo(I1)).collect(Collectors.toList());
        // print the Array list with assecnd order sorting
        System.out.println(list3);
    }
}
