
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_05 {
    public static void main(String[] args) {

        // 5. Write a Java program to update an array element by the given element.
        ArrayList<String> list = new ArrayList<>();
           list.add("md Raja alam");
           list.add("md Adil alam");
           list.add("md Rahat ali");
           list.add("md furkan alam");
           list.add("md saddam alam");

          // remove the third element from an array list.
        Iterator<String> it= list.iterator();
           while (it.hasNext()){
               String str= it.next();
               if(str=="md furkan alam"){
                   it.remove();
               }
           }
        System.out.println(list);
    }
}
