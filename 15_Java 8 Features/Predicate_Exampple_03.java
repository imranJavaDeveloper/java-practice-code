

import java.util.function.Predicate;

public class Predicate_Exampple_03 {
    public static void main(String[] args) {

        int [] arr={0,5,10,20,30,45,26,21,226,22,45,6};

        Predicate<Integer> p= (i)-> i%2==0;
        Predicate<Integer> p2=(i)-> i>10;

        // join two predicate
        for (int x: arr){
            if (p.and(p2).test(x)){
                System.out.println(x);

                /* in this example two condition preform at once time
                * 1 print those number divided by 2
                * 2 print those number which above 10*/
            }
        }
    }
}
