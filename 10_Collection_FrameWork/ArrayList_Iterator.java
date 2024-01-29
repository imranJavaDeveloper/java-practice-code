

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator {
    public static void main(String[] args) {

        ArrayList l= new ArrayList();

        // Add element

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        // remove a element form the ArrayList using iterator

        Iterator<Integer> it= l.iterator();
        while (it.hasNext()){
            int item= it.next();
            if(item%2==0){
                it.remove();
            }
            System.out.println(l);
        }
    }
}
