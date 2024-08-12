import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheMax {

    public static void main(String[] args) {
        
        /* find the max value form the list */

        List<Integer> list= Arrays.asList(45,25,65,98,35,14,26,66);

         /** sorted the list and find the max value form the list*/
        List<Integer> list2= list.stream().sorted((i,j)->(i<j)?-1:(i>j)?+1:0).limit(1).collect(Collectors.toList());

        System.out.println(list2);

    }
    
}
