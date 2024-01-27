
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_05 {
    public static void main(String[] args) {

        ArrayList<String> str= new ArrayList<>();
        str.add("learn");
        str.add("from");
        str.add("online");

        // create listIterator
        ListIterator<String> it= str.listIterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        // print the String backward direction

        while (it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }
    }
}
