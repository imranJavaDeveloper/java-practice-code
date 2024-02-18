
import java.util.ArrayList;
import java.util.Collections;

public class Rev_ArrayList {
    public static void main(String[] args) {


        // Write a Java program to reverse elements in an array list.

          ArrayList<Integer> list= new ArrayList<>();

           list.add(78);
           list.add(7);
           list.add(88);
           list.add(85);
           list.add(105);


        System.out.println(" before reverse ");
        System.out.println(list);

        System.out.println(" After reverse");

        // reverse the ArrayList using the collection.reverse()
        Collections.reverse(list);
        System.out.println(list);


    }
}
