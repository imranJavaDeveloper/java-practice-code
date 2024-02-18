
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Rev {
    public static void main(String[] args) {

        // print the linked list  in reverse order

        LinkedList<Integer> list = new LinkedList<>();
          list.add(78);
          list.add(89);
          list.add(78);
          list.add(69);
          list.add(105);

        System.out.println("print before reverse ");
        System.out.println(list);

        System.out.println("print After reverse ");
       Collections.reverse(list);

        Iterator<Integer> it= list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
