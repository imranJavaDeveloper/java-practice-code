

import java.util.function.Function;

public class Function_Example_02 {
    public static void main(String[] args) {

        // take String and return its length
        Function<String,Integer> P=(i)->i.length();

        // return all string length one by one
        System.out.println(P.apply("imran")); // 5
        System.out.println(P.apply("Raja")); //  4
        System.out.println(P.apply("Shahid"));// 6

        // covert the String into Uppercase
        Function<String,String> P2=(i)->i.toUpperCase();

        System.out.println(P2.apply("md imran alam"));
        // covert the String into uppercase MD IMRAN ALAM

    }
}
