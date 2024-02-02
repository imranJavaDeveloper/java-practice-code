import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_03 {

    public static void main(String[] args) {
        
        // create Integer LinkedList
        LinkedList<Integer> list= new LinkedList<>();

        // Add lement 
         list.add(45);
         list.add(89);
         list.add(24);
         list.add(45);
         list.add(254);

         // print using the Iterator 
           Iterator<Integer> it= list.iterator();
           while (it.hasNext()) {
            System.out.println(it.next());
            
           }
    }
}
