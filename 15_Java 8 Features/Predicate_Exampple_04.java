
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Exampple_04 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(78,458,58,669,5885,295,588,258,4525,78569,85598,558,8);

        // create Array of String 
        String [] name={"furkan","imran","raja","shahid","Atif"};

        Predicate<String> name2=(n)->n.length()>5;

        // print those name which legnth is upper 5
         // travese the Array And check the Condition
        for(String k:name){
            if (name2.test(k)) {
                System.out.println(k);
                
            }
        }

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
