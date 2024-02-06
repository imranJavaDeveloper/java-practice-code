
import java.util.ArrayList;

public class ArrayList_04 {
    public static void main(String[] args) {

      // 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        ArrayList<String> list= new ArrayList<>();
              list.add("md imran alma");
              list.add("md furkan alam");
              list.add("md Atif alam");
              list.add("md Raja alam");
              list.add("md Adil alam");

        //retrieve an element (at a specified index)

           System.out.println(list.get(4));

    }
}
