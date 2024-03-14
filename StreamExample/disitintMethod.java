
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class disitintMethod {
    public static void main(String[] args) {

        List<String> list=  Arrays.asList("Bike","Car","Bus","Bus","Car","Auto","Bus","Car");

        // remove duplicate form the list
        List<String> list2= list.stream().distinct().collect(Collectors.toList());
        System.out.println(list2);

        // create another ArrayList

        ArrayList<Integer> lm= new ArrayList<>();
            lm.add(58);
            lm.add(44);
            lm.add(26);
            lm.add(78);
            lm.add(88);
            lm.add(10);
            lm.add(58);
            lm.add(78);
            lm.add(44);

            // remove duplicate form ArrayList use disint()
           List<Integer> result=lm.stream().distinct().collect(Collectors.toList());
           System.out.println(result);




    }
}
