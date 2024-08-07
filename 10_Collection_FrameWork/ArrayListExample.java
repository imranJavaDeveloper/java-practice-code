
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
         list.add(45);
         list.add(78);
         list.add(22);
         list.add(12);
         list.add(78);

        Collections.sort(list,new MyComparator());

        Iterator<Integer> it= list.iterator();

        while (it.hasNext()){

            System.out.println(it.next());
        }
    }
}


class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer i, Integer j) {
        if (i<j){
            return -1;
        }
        if (i>j){
            return +1;
        }
        else {
            return 0;
        }

    }
}