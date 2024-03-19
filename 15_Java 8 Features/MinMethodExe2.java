
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MinMethodExe2 {
    public static void main(String[] args) {

        // create ArrayList

        List<Integer> lt= Arrays.asList(45,25,888,58,558,5698,4855,8855,78);

        // find the min value in the list
              Optional o= lt.stream().min((i1, i2)->i1.compareTo(i2));
                 System.out.println("min value :"+o);


        // find the max value in the list
        Optional r= lt.stream().max((k1,k2)->k1.compareTo(k2));
        System.out.println(r);


        // remove duplicate value in the list
            List<Integer> list=lt.stream().distinct().collect(Collectors.toList());
            System.out.println(list);

    }
}
