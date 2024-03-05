package collection_framework.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Student_Sorting {
      String name;
      int roll;
      int age;
    // constructor
    public Student_Sorting(String name,int age,int roll) {
        this.name = name;
        this.age=age;
        this.roll=roll;
    }

    public String toString(){
        return name+" "+age+" "+roll;
    }

    public static void main(String[] args) {

        ArrayList<Student_Sorting> list= new ArrayList<>();
        list.add(new Student_Sorting("md imran alam",25,1001));
        list.add(new Student_Sorting("md raja alam",24,10063));
        list.add(new Student_Sorting("md zarka alam",75,1006));
        list.add(new Student_Sorting("md kainat alam",25,1007));
        list.add(new Student_Sorting("md sufyan alam",85,1008));


        // preform sorting based on age
          Comparator<Student_Sorting> it= new Comparator<Student_Sorting>() {
              @Override
              public int compare(Student_Sorting s1, Student_Sorting s2) {
                 if(s1.roll<s2.roll){
                     return -1;
                 }
                 if (s1.roll>s2.roll){
                     return +1;
                 }
                 else {
                     return 0;
                 }
              }
          };

          // preform sorting based on roll number
            Collections.sort(list,it);

        Iterator<Student_Sorting> iit= list.iterator();
           while (iit.hasNext()){
               System.out.println(iit.next());
           }
    }
}

// preform sorting based on age
