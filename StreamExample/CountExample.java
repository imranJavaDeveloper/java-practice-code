

import java.util.ArrayList;

public class CountExample {
    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<>();
        list.add(78);
        list.add(89);
        list.add(90);
        list.add(78);
        list.add(55);
        list.add(78);
        list.add(42);

          long count= list.stream().filter(m->m>50).count();
          System.out.println("print how many number upper 50 :="+count);
    }
}
