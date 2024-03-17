
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Exampple_04 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(78,458,58,669,5885,295,588,258,4525,78569,85598,558,8);

        Predicate<Integer> num=(k)->k%2==0;
        Predicate<Integer> num2=(j)->j>400;

        //traverse ArrayList and check condition
        //print onily even number and uppper 400
          for (Integer list2 :list){
              if (num.and(num2).test(list2)){
                  System.out.println(list2);
              }
          }
    }
}
