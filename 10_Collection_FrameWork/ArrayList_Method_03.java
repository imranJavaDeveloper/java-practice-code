
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Method_03 {
    public static void main(String[] args) {

        // create ArrayList

        ArrayList<String> list= new ArrayList<>();
              list.add("Md Imran alam");
              list.add("Md Asad alam");
              list.add("Md Raja alam");
              list.add("Md Arman Ansari");

        // Remove data from the ArrayList
        list.remove("Md Imran Alam");
        System.out.println(list);

        // Add element based on index
        list.add(1,"md Adil Alam");
        System.out.println(list);

        // Set value for a element
        list.set(2,"Md Rahat Ali");

        // check the size of ArrayList
        System.out.println(list);

        // for print all value

        Iterator<String> it= list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
