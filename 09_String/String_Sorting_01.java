

import java.util.Arrays;

public class String_Sorting_01 {

    // create a method for convert the string

    public static String change(String name){
        char TemArray[]=name.toCharArray();

        Arrays.sort(TemArray);

        return new String(TemArray);
    }
    public static void main(String[] args) {

        // string sorting

        String name="furkan";

        // pass the String using method
        String name2= change(name);

        System.out.println(" before convert the String "+name);

        System.out.println(" before convert the String "+name2);

    }
}
