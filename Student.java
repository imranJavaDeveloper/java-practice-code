package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {

    int id;
    private String name;

    public Student(int id,String name){
        this.name=name;
        this.id=id;
    }

    public String toString()
    {
        return name+" "+id;
    }
}

class UseStudent{
    public static void main(String[] args) {

        ArrayList<Student> s= new ArrayList<>();
        s.add(new Student(101,"imran"));
        s.add(new Student(106,"Atif"));

        s.add(new Student(109,"furkan"));
        s.add(new Student(108,"shahid"));


        Collections.sort(s,(o1,o2)->(o1.id <o2.id)?-1:(o1.id >o1.id)?+1 :0);

        ///  sorting based on id
        System.out.println(s);
    }
}
