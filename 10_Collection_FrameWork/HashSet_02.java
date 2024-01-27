
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_02 {
    public static  void main(String[] args) {


        HashSet<String> list= new HashSet<>();

        list.add("furkan");
        list.add("raja");
        list.add("rahat");
        list.add("king");

        // print using the itrator

        Iterator<String> it= list.iterator();
//        System.out.println(it.next());

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
