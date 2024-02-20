

import java.util.function.Function;

public class Function_Example_01 {
    public static void main(String[] args) {

        // Function predefine method of function interface
        // Function  contain apply() method

        Function<Integer,Integer> f=(i)->i*i;
        System.out.println("Square of 5:"+f.apply(5)); // Square of 5:25
        System.out.println("Square of 4:"+f.apply(4)); // Square of 4:16

    }
}
