

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Cpmparator_Sorting {
    public static void main(String[] args) {

 // Natural Sorting using the Comparator

        Comparator<Integer> it= new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i < j) {
                    return -1;
                } else if (i > j) {
                    return +1;
                } else {
                    return 0;
                }
            }
        };

            // create ArrayList 

        ArrayList<Integer> list= new ArrayList<>();

        list.add(45);
        list.add(78);
        list.add(14);
        list.add(78);
        list.add(24);

        System.out.println(list);

//        Comparator<Integer> it=(i,j)->(i<j)?-1:(i>j)?1:0;
        Collections.sort(list,it);
        System.out.println(list);



    }

}
