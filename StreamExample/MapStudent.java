
import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapStudent {
    String name;
    int roll;
    int marks;

    // constructor
    public MapStudent(String name,int marks,int roll){
        this.roll= roll;
        this.marks=marks;
        this.name=name;
    }

    // override toString()
    public String toString(){
        return name+" "+marks+" "+roll;
    }

    public static void main(String[] args) {

        ArrayList<MapStudent> student= new ArrayList<>();

        // Add element one by one in the ArrayList
        student.add(new MapStudent("md imran alam",85,101));
        student.add(new MapStudent("md adil alam",90,102));
        student.add(new MapStudent("md raja alam",80,103));
        student.add(new MapStudent("md aftab alam",88,104));

        // sorted this ArrayList based on marks
        Comparator<MapStudent> com=(I1,I2)->(I1.marks> I2.marks)?1:(I1.marks < I2.marks)?-1:0;
        Collections.sort(student,com);
        System.out.println(student);

        // add 5 marks for all student
        List<Integer> list = student.stream().map(m->m.marks+=5).collect(Collectors.toList());
        // all marks increase form the five
        System.out.println(list);
    }
}
