
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_08 {
    public static void main(String[] args) {

        // 8.Write a Java program to copy one array list into another
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("45");
        list1.add("78");
        list1.add("78");
        list1.add("24");
        list1.add("65");
        list1.add("145");

        // create anOther ArrayList
          ArrayList<String> list2= new ArrayList<>();
            list2.add("Imran");
            list2.add("furkan");
            list2.add("Rahat");
            list2.add("dilsaan");
            list2.add("dilsad");

        System.out.println(" before change ");
        System.out.println(list1);
        System.out.println(" before change ");
        System.out.println(list2);

        // here copy one into other
        Collections.copy(list1,list2);

        System.out.println("After change ");
        System.out.println(list1);

        System.out.println("After change ");
        System.out.println(list2);

    }
}
