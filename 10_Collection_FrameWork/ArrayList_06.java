
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_06 {
    public static void main(String[] args) {

      // 6.Write a Java program to search for an element in an array list.
        ArrayList<Integer> list= new ArrayList<>();
          list.add(45);
          list.add(87);
          list.add(55);
          list.add(12);
          list.add(14);
          list.add(355);
          list.add(785);
          list.add(845);

        //  search for an element in an array list.
        // use contain() method for searching the element in ArrayList

        System.out.println(" value contain "+list.contains(355));


        Iterator<Integer> it= list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}