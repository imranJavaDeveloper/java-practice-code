
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Emp {
    String name;
    int id;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Emp(String name, int id) {
        this.name = name;
        this.id=id;
    }
}

class Test{
    public static void main(String[] args) {

        ArrayList<Emp> list= new ArrayList<>();
        list.add(new Emp("furkan",101));
        list.add(new Emp("Adil",102));
        list.add(new Emp("Raja",103));
        list.add(new Emp("Rahat",104));
        list.add(new Emp("Asif",105));


        // sorting based on emp id
       // Collections.sort(list,(e1,e2)->(e1.id)<(e2.id)?-1:(e1.id)>(e2.id)?+1:0);

        //  sorting based on emp name
        Collections.sort(list,(e1,e2)->(e1.name.compareTo(e2.name)));
//       System.out.println(list);

        Iterator<Emp> it= list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
