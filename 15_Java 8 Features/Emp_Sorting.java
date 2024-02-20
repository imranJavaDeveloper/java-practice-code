
import java.util.ArrayList;
import java.util.Collections;

public class Emp_Sorting {

    String name;
    int Emp_Id;

    // constructor
    Emp_Sorting(String name,int Emp_Id){
        this.Emp_Id=Emp_Id;
        this.name=name;
    }

    public String toString(){
        return name+" "+Emp_Id;
    }
    public static void main(String[] args) {

        ArrayList<Emp_Sorting> list= new ArrayList<>();
         list.add(new Emp_Sorting("imran alam",108));
         list.add(new Emp_Sorting(" adil alam",112));
         list.add(new Emp_Sorting(" raja alam",104));
         list.add(new Emp_Sorting(" shahid alam",102));

        System.out.println(list);

        //Collections.sort(list,(e1,e2)-> (e1.Emp_Id< e2.Emp_Id)? -1:(e1.Emp_Id > e2.Emp_Id) ? 1:0 );
        Collections.sort(list,(e1,e2)->(e1.name.compareTo(e2.name)));

        System.out.println("After sorting the element based on Emp Name");
        System.out.println(list);
    }
}
