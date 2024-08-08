
import java.util.*;
import java.util.HashMap;

public class HasMapCustomSorting{
        public static void main(String[] args) {
            // Create a HashMap and add some entries
            HashMap<Integer, String> hashMap = new HashMap<>();
            hashMap.put(3, "Apple");
            hashMap.put(1, "Banana");
            hashMap.put(4, "Cherry");
            hashMap.put(2, "Date");

            // Get the entry set from the HashMap and convert it to a list
            List<Map.Entry<Integer, String>> list = new ArrayList<>(hashMap.entrySet());

            // Sort the list using Collections.sort() and a Comparator
            Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
                public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });

            System.out.println(list);
            // Create a LinkedHashMap to maintain the insertion order
            LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<Integer, String> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }

            // Print the sorted map
            for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + " Value: " + entry.getValue());
            }
        }
    }


