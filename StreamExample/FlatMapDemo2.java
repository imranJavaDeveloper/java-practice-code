
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
    String name;
    int roll;
    int marks;

    // constructor
    public FlatMapDemo2(String name,int roll,int marks){
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }

    // override toString()
    public String toString(){
        return name+" "+roll+" "+marks;
    }

    public static void main(String[] args) {

        ArrayList<FlatMapDemo2> list1= new ArrayList<>();
        list1.add(new FlatMapDemo2("md imran alam",102,75));
        list1.add(new FlatMapDemo2("md adil alam",103,80));
        list1.add(new FlatMapDemo2("md raja alam",104,78));
        list1.add(new FlatMapDemo2("md furkan alam",105,80));
        list1.add(new FlatMapDemo2("md Aftab alam",106,78));
        list1.add(new FlatMapDemo2("md Junaid alam",107,90));


        List<String> list2=list1.stream().map(m->m.name).collect(Collectors.toList());
        System.out.println(list2);
    }
}
