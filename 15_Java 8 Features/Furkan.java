
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Furkan {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(45);
        list.add(32);
        list.add(78);
        list.add(98);
        list.add(66);

        // sorting with collections.sort()

        Collections.sort(list,(I1,I2)->(I1<I2)?+1:(I1>I2)?-1:0);

        // print the ArrayList

        Iterator<Integer> it= list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
