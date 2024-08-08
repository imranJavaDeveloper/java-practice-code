
import java.util.*;
import java.util.HashMap;

public class HasMapNaturalSorting {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap= new HashMap<>();
           hashMap.put(101,"Furkan");
           hashMap.put(105,"Raja");
           hashMap.put(106,"Shahid");
           hashMap.put(109,"Arman");


             /**  sort the HasMap  based on id */

             TreeMap<Integer,String> treeMap= new TreeMap<>(hashMap);

             /** traverse the treeMap */

        for (Map.Entry<Integer, String> t: treeMap.entrySet()) {
            System.out.println(t.getKey()+" "+ t.getValue());
        }


        /** SECOND WAY OF SORTING BASED ON ID*/
        List<Map.Entry> list= new ArrayList<>(hashMap.entrySet());
        System.out.println(list);

    }
}
