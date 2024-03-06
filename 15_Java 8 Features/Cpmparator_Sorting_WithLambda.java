
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cpmparator_Sorting_WithLambda {
    public static void main(String[] args) {

        // descending order sorting

        ArrayList<Integer> list= new ArrayList<>();
        list.add(45);
        list.add(78);
        list.add(14);
        list.add(78);
        list.add(24);

        System.out.println(" before sorting ");
        System.out.println(list);
        Comparator<Integer> it=(i,j)->(i<j)?1:(i>j)?-1:0;

        System.out.println("After sorting ");
        Collections.sort(list,it);
        System.out.println(list);
    }
}
