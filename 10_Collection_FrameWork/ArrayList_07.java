
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_07 {
    public static void main(String[] args) {

        // 7. Write a Java program to sort a given array list.

        ArrayList<Integer> list= new ArrayList<>();
          list.add(45);
          list.add(78);
          list.add(78);
          list.add(24);
          list.add(65);
          list.add(145);
          list.add(4);
          list.add(89);
          list.add(32);

          // ArrayList before sorting

        System.out.println(list);

        // ArrayList After sorting preform sorting using the Collections method
        // this is natural sorting
        Collections.sort(list);

    }
}
