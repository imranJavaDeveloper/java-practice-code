
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_02 {
    public static void main(String[] args) {

        Map<String,Integer> mp= new HashMap<>();
        mp.put("imran",101);
        mp.put("furkan",101);
        mp.put("raja",101);
        mp.put("atif",101);
        mp.put("jaifi",101);
        mp.put("imran",102);

        // print key and value using the for each loop
        for (Map.Entry Mp : mp.entrySet()){
            System.out.println(Mp.getKey()+" "+Mp.getValue());

        }
        System.out.println("thank you for doing this ");
    }
}
