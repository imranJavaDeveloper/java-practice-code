
import java.util.HashMap;
import java.util.Map;

public class HashMap_Method_03 {
    public static void main(String[] args) {

        // All HashMap Method

       Map<Integer,String> mp= new HashMap<>();
                    mp.put(101,"md imran alam");
                    mp.put(102,"md raja alam");
                    mp.put(103,"md adil alam");
                    mp.put(104,"md furkan alam");

                // 2. getKey()
                System.out.println(mp.get(101));
                System.out.println(mp.get(102));
                System.out.println(mp.get(103));
                System.out.println(mp.get(104));

                 // 3. remove()
                System.out.println(mp.remove(101));
                System.out.println(mp);

                // 4. containsKey()

        System.out.println(mp.containsKey(101)); // give true or false
        System.out.println(mp.containsValue("md furkan alam"));// ture (if present key return true otherwise false

              // 5. is Empty()
        System.out.println(mp.isEmpty()); // if map is empty return true otherwise return false

             // 6. size()
        System.out.println(mp.size()); // give the size current size 3

            // 7.clear()
           mp.clear(); // this method clean every thing key or value both
    }
}
