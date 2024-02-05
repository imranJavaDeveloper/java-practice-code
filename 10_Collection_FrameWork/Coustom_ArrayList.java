
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

class Emp{
    private int age;
    private String name;
    private double sal;

    // create constructor for assign value
    Emp(int age,String name,double sal){
        this.age=age;
        this.name=name;
        this.sal=sal;
    }

    public static void main(String[] args) {
        ArrayList<Emp> list= new ArrayList<>();
           Emp e1= new Emp(101,"imran",2555.25);
           Emp e2= new Emp(102,"furkan",2555.25);

           Emp e3= new Emp(103,"nazis",4558.25);

           Emp e4= new Emp(104,"danish",255.25);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

    }

    @Override
    public String toString() {
        return "Emp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp emp)) return false;
        return age == emp.age && Double.compare(emp.sal, sal) == 0 && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, sal);
    }


}

