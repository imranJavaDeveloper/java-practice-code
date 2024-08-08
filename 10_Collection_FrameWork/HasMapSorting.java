
import java.util.*;
import java.util.HashMap;

public class HasMapSorting {

    public static void main(String[] args) {



        /** Comparator*/

        Comparator<Map.Entry<Integer,String>> m= new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        };

       /**hasMap*/
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Apple");
        hashMap.put(1, "Banana");
        hashMap.put(4, "Cherry");
        hashMap.put(2, "Date");

        /** sorting based on TreeMap */

        TreeMap<Integer,String> map= new TreeMap<>(hashMap);

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Id "+entry.getKey()+" Value "+entry.getValue());
        }


        /** sorting based Using ArrayList*/

        ArrayList<Map.Entry<Integer,String>> arrayList= new ArrayList<>(hashMap.entrySet());

        Collections.sort(arrayList,m);

        /** traverse ArrayList*/

          for (Map.Entry<Integer,String> sorted : arrayList){
              System.out.println("Id :"+sorted.getKey()+" Value "+sorted.getValue());
          }
    }
}
