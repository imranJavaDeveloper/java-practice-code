

import java.util.LinkedList;

public class LinkedList_02 {
    public static void main(String[] args) {

        LinkedList<String> ls= new LinkedList<>();
          ls.add("furkan");
          ls.add("raja");
          ls.add("adil");

          // print using the for loop

        for(String x: ls){
            System.out.print(x+" ");
        }

        ls.addFirst("md furkan alam");
        System.out.println(ls);

        ls.addLast("md rahat ansari");
        System.out.println(ls);

       int element= ls.size();
        System.out.println(element);

        ls.removeFirst();
        System.out.println(ls);

       ls.removeLast();
        System.out.println(ls);

        int size= ls.size();
        System.out.println(size);

        System.out.println(ls.indexOf("furkan"));
        System.out.println(ls.indexOf("adil"));



    }
}
