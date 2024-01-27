
import java.util.Collections;
import java.util.HashSet;

public class HashSet_01 {
    public static void main(String[] args) {

        // create hashset

        HashSet<String> hs= new HashSet<>();

        HashSet<Integer> h= new HashSet<>();
        h.add(45);
        h.add(56);
        h.add(25);
        h.add(42);
        h.add(66);
        h.add(98);
        // here string value
        hs.add("A");
        hs.add("B");
        hs.add("c");
        hs.add("D");
        hs.add("e");

          // print all value using the for loop

         for(String x :hs){
             System.out.print(x+" ");
         }

         // add element on spicific position
            hs.add("raza ");
        System.out.println(hs);

        System.out.println(h);


        if (h.contains(45)) {
            System.out.println("present ");
        }
        else {
            System.out.println("not present ");
        }

    }
}
