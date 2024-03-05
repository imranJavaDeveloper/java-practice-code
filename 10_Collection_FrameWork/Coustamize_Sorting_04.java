
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Coustamize_Sorting_04 {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> list= new ArrayList<>();
            list.add(47);
            list.add(14);
            list.add(78);
            list.add(14);
            list.add(78);

        System.out.println(" before sorting ");
        System.out.println(list);

        System.out.println("After sorting ");
        Collections.sort(list,new MyComparator());
        System.out.println(list);
    }
}

  class   MyComparator implements Comparator<Integer>{
      @Override
      public int compare(Integer i, Integer j) {
          if ( i<j){
              return -1;
          }
          if (i>j){
              return +1;
          }
          else {
              return 0;
          }
      }
  }

