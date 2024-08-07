
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Emp {

    public Emp(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    private int id;
    private String name;
    int marks;

    public static void main(String[] args) {


        ArrayList<Emp> list= new ArrayList<>();
        list.add(new Emp(101,"Sonu alam",338));
        list.add(new Emp(102," Atif alam",396));
        list.add(new Emp(103,"Arman alam",363));
        list.add(new Emp(104,"Shahid alam",405));
        list.add(new Emp(105,"Raja alam",333));
        list.add(new Emp(106,"Adil alam",334));

        Comparator<Emp> com= new Comparator<Emp>() {
            @Override
            public int compare(Emp i, Emp j) {
                if (i.id< j.id){
                    return -1;
                }
                if (i.id> j.id){
                    return +1;
                }
                else {
                    return 0;
                }

            }
        };


        Collections.sort(list,com);


        Iterator<Emp> it= list.iterator();

        while (it.hasNext()){
            System.out.println(it.hasNext());
        }
    }

}

