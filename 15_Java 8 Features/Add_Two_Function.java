

import java.util.function.Function;

public class Add_Two_Function {
    public static void main(String[] args) {



        Function<Integer,Integer> f1=(i)-> 2*i;
        Function<Integer,Integer> f2=(i)-> i*i*i;
        // combined two function
        // we can combine two or more Function to gather
        // andThen calculate first 2*i than after i*i*i;

        System.out.println( f1.andThen(f2).apply(2));//64

        // compose calculate first i*i*i after 2*i;

        System.out.println( f1.compose(f2).apply(2));//16

        System.out.println(f1.andThen(f2).apply(5));//100
        System.out.println(f1.compose(f2).apply(5));//250



    }
}
