package practice_progrma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Student {

    String name;
    int age;
    int roll;

    // constructor
    public Student(String name,int age,int roll){
        this.age=age;
        this.name=name;
        this.roll=roll;
    }

    // override toString method

    public String toString(){
        return name+" "+age+" "+roll;
    }
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Student> list= new ArrayList<>();

        list.add(new Student("imran alam",25,1001));
        list.add(new Student("adil alam",28,1002));
        list.add(new Student("raja alam",29,1006));
        list.add(new Student("Mustari khatoon ",22,1005));
        list.add(new Student("Sabir alam",17,1005));

        // print element one by one using the iterator
        // preform sorting based on Student age

        //Comparator<Student> com=(s1,s2)-> (s1.age< s2.age)?-1:(s1.age>s2.age)?1:0;

        // sorting based on Student name based
        Comparator<Student> com=(s1,s2)-> s1.name.compareTo(s2.name);
        Collections.sort(list,com);

        Iterator<Student> it= list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}

