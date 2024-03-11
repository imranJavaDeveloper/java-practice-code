package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(78);
        list.add(89);
        list.add(90);
        list.add(78);
        list.add(55);
        list.add(78);
        list.add(42);

        // output with some sorting order
        Comparator<Integer> com=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
        List<Integer> list1=list.stream().sorted(com).collect(Collectors.toList());
        // print the Array list with assecnd order sorting
        System.out.println(list1);
    }
}
