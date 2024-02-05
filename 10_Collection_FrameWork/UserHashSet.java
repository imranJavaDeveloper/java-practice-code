
import java.util.HashSet;

public class UserHashSet {

        private int age;
        private String name;
        private double sal;

    @Override
    public String toString() {
        return "UserHashSet{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    // constructor
    UserHashSet(int age,String name,double sal){
        this.age=age;
        this.name=name;
        this.sal=sal;
    }

    public static void main(String[] args) {
        HashSet<UserHashSet> list = new HashSet<>();
        UserHashSet st1=new UserHashSet(10,"imran",25000.5);
        UserHashSet st2=new UserHashSet(14,"rahat",25000.5);
        UserHashSet st3=new UserHashSet(14,"furkan",25000.5);
        UserHashSet st4=new UserHashSet(16,"raja",25000.5);

              list.add(st1);
              list.add(st2); 
              list.add(st3);
              list.add(st4);

              for (UserHashSet x : list){
                  System.out.println(x);
              }
    }
}
