
import java.util.Collections;
import java.util.LinkedList;

public class SwapVlaueLinkedList {
    public static void main(String[] args) {

        // swap the two value in linked list
        LinkedList<Integer> list= new LinkedList<>();

        list.add(45);
        list.add(450);
        list.add(785);
        list.add(198);
        list.add(65);
        list.add(5);

        System.out.println(" before swap the value");
        System.out.println(list);

        Collections.swap(list,0,5);
        System.out.println("after swap the value");
        System.out.println(list);

    }
}
