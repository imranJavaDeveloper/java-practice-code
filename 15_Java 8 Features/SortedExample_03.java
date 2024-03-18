
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.function.Predicate;

public class SortedExample_03 {
    String name;
    int marks;
    int age;

    // constructor
    public SortedExample_03(String name,int marks,int age){
        this.age=age;
        this.marks=marks;
        this.name=name;
    }

    // override toString()

    public String toString(){
        return name+" "+marks+" "+age;

    }

    public static void main(String[] args) {

        ArrayList<SortedExample_03> list= new ArrayList<>();
                 list.add(new SortedExample_03("md imran alam",78,27));
                 list.add(new SortedExample_03("md raja alam",75,26));
                 list.add(new SortedExample_03("md Atif alam",80,24));
                 list.add(new SortedExample_03("md junaid alam",98,28));


                 // print only those student which marks above 80
                Predicate<SortedExample_03> list2=n->n.marks>=80;
                for (SortedExample_03 k :list){
                 if (list2.test(k)){
                System.out.println(k);
            }
        }
    }
}
