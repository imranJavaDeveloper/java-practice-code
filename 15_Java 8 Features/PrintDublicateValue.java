
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDublicateValue {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();

        list.add(45);
        list.add(21);
        list.add(98);
        list.add(35);
        list.add(21);
        list.add(22);
        list.add(98);

        Iterator<Integer> it= list.iterator();

        while (it.hasNext()){

            int x=it.next();

            if (x==98){
                System.out.println(x);
            }

        }
    }
}
