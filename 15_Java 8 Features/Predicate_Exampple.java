

import java.security.SecureRandom;
import java.util.function.Predicate;

public class Predicate_Exampple{


//    public static void Get(String Arry[]){
//
//        for (String s:Arry){
//               if(s.length()>5){
//                   System.out.println(s);
//               }
//        }
//
//    }

    public static void main(String[] args) {
        String[] s={"Ashif","furkan","sarfarz","raj","md atif abdullah"};
//        Get(s);

        // same question solve with Predicate function
        Predicate<String > p= (s1 -> s1.length()>5);

        for (String x :s){
            if (p.test(x)){
                System.out.println(x);
            }
        }
    }
}
