
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_01 {
    public static void main(String[] args) {

        // Create ArrayList and show all element

        ArrayList<Integer> list= new ArrayList<>(10);
        // create String ArrayList
        ArrayList<String> str=new ArrayList<>();
        // Add element
           list.add(10);
           list.add(20);
           list.add(30);
           list.add(40);
           list.add(50);
           list.add(60);
           list.add(70);

           //Add String type value 
           str.add("mran");
           str.add("Raja");
           str.add("Atif");
           str.add("Adil");
           str.add("Shahid");
           // show all String type data
           System.out.println(str);
           // show all Integer type data
        System.out.println(list);

    }
}
