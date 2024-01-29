

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User_Sorting {
    public static void main(String[] args) {

        Comparator<Integer> it= new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {

                if(i<j){
                    return 1;
                }
                else if (i>j){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        };


        List<Integer> li= new ArrayList<Integer>();
        li.add(78);
        li.add(45);
        li.add(26);
        li.add(24);

        Collections.sort(li,it);
        System.out.println(li);


    }
}
