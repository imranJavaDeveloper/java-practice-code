
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_02 {
    public static void main(String[] args) {

        // 2.Write a Java program to iterate through all elements in an array list.

        ArrayList<Integer> list = new ArrayList<>();
             list.add(45);
             list.add(78);
             list.add(12);
             list.add(65);
             list.add(89);
             list.add(25);
             list.add(80);
             list.add(45);

             // print all element using the iterator
        Iterator<Integer> it= list.iterator();
           while (it.hasNext()){
               System.out.println(it.next());
           }
    }
}
