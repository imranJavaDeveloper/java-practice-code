

import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.Callable;

public class LinkedList_01 {
    public static void main(String[] args) {

        LinkedList<Integer> l= new LinkedList<>();

        l.add(45);
        l.add(78);
        l.add(12);

        System.out.println(l);

        // sorting
        Collections.sort(l);
        System.out.println(l);

        // remove element

        l.remove(0);
        System.out.println(l);

        // put the element on spicific position

        l.add(1,56);
        System.out.println(l);

        l.set(1,32);
        System.out.println(l);

       Collections.sort(l);
        System.out.println(l);

        System.out.println(l.contains(45));//true
        System.out.println(l.contains(78));//true
        System.out.println(l.contains(25));//false
    }
}
