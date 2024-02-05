

import java.util.HashSet;

public class Student {
    private String name;

    // constructor
    Student(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class HashSetDemo{
    public static void main(String[] args) {
        // create user define HashSet
        HashSet<Student> st= new HashSet<>();
         Student s1= new Student("furkan");
         Student s2= new Student("imran");

         Student s3= new Student("raza");

         Student s4= new Student("raza");

        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);

        System.out.println(st);

    }
}
