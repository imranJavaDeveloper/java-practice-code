

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Marks {
    public static void main(String[] args) {

        ArrayList<Integer> marks= new ArrayList<>();
                           marks.add(78);
                           marks.add(89);
                           marks.add(90);
                           marks.add(78);
                           marks.add(55);
                           marks.add(78);
                           marks.add(42);
          List<Integer> list=marks.stream().filter(ma->ma>50).collect(Collectors.toList());
        // print marks upper 50
        System.out.println("print marks upper 50");
        System.out.println(list);

        // print marks below 50
        System.out.println("print marks below 50");
        List<Integer>list2ist2=marks.stream().filter(m->m<50).collect(Collectors.toList());
        System.out.println(list2ist2);

    }
}
