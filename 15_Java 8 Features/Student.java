
import java.util.ArrayList;
import java.util.function.Predicate;
public class Student {

    int id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public Student(int id, String name){
        this.name=name;
        this.id=id;
    }
}
class InnerStudent{
    public static void main(String[] args) {

        ArrayList<Student> li= new ArrayList<>();
        li.add(new Student(11,"Arman"));
        li.add(new Student(51,"shahid"));
        li.add(new Student(91,"Atif"));
        li.add(new Student(16,"alfak"));
        li.add(new Student(17,"imran"));


        // print those student which student marks above 18

        Predicate<Student> p=(m)->m.id>40;

        for (Student s: li){

            if (p.test(s)){
                System.out.println(s);
            }
         }

    }
}
