
import java.util.ArrayList;

public class ArrayList_03 {
    public static void main(String[] args) {

      // Write a Java program to insert an element into the array list at the first position.
        ArrayList<Integer> list= new ArrayList<>();
           list.add(78);
           list.add(25);
           list.add(22);
           list.add(36);
           list.add(88);
           list.add(14);

           //  insert an element into the array list at the first position.
             list.add(0,55);

             // print all element
             System.out.println(list);
    }
}
