
import com.sun.security.jgss.GSSUtil;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Coustamize_Sorting_05 {
    public static void main(String[] args) {


        Comparator<Integer> com= new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i<j){
                    return -1;
                }
                if (i>j){
                    return +1;
                }
                else {
                    return 0;
                }
            }
        };

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();
          list.add(45);
          list.add(47);
          list.add(14);
          list.add(89);
          list.add(44);
          list.add(14);

        System.out.println(" before sorting ");
        System.out.println(list);

        System.out.println("Natural oredr sorting oder  sorting ");
        Collections.sort(list,com);  // new MyComparator2()
        System.out.println(list);


    }
}
//class MyComparator2 implements Comparator<Integer>{
//    public int compare(Integer i,Integer j){
//        if (i<j){
//            return -1;
//
//        }
//        if (i>j){
//            return +1;
//        }
//        else {
//            return 0;
//        }
//    }
//}