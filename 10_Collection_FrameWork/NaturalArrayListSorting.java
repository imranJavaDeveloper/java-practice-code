
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;

public class NaturalArrayListSorting {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> list= new ArrayList<>();
          // add element
          list.add(45);
          list.add(21);
          list.add(22);
          list.add(78);
          list.add(22);
          list.add(12);

          // Natural Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
