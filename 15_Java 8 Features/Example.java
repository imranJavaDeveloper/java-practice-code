package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1<o2){
            return -1;
        } else if (o1>o2) {
            return +1;
        }
        else {
            return 0;
        }

    }
}

public class Example {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(45);
        list.add(450);
        list.add(505);
        list.add(650);
        list.add(15);
        list.add(65);


        System.out.println(list);
        ///  natural sorting
        Collections.sort(list);

        System.out.println(list);
    }
}
