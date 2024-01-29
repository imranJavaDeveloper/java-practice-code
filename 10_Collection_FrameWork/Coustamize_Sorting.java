
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Coustamize_Sorting {
    public static void main(String[] args) {


        Comparator<Integer> it = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {

                if (i < j){
                    return +1;
                } else if (i > j) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        };
                ArrayList<Integer> list = new ArrayList<>();
                // Add element
                list.add(12);
                list.add(20);
                list.add(64);
                list.add(45);
                list.add(87);

        Collections.sort(list,it);
                System.out.println(list);
                System.out.println("thnaks");


    }
}