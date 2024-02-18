
import java.util.Iterator;
import java.util.LinkedList;

public class Strudent_LinkedList {

    private String name;
    private int roll;
    private  String add;

    // create a constructor for intilization

    Strudent_LinkedList(String name,int roll,String add){
        this.name=name;
        this.roll= roll;
        this.add=add;
    }

    // override to string()
    public String toString(){
        return name+" "+ roll+" "+add+" ";
    }
    public static void main(String[] args) {

        LinkedList<Strudent_LinkedList> st= new LinkedList<>();
          st.add(new Strudent_LinkedList("md imran alam",23,"Nawada"));
          st.add(new Strudent_LinkedList("md frukan alam",23,"Nawada"));
          st.add(new Strudent_LinkedList("md adil alam",23,"Nawada"));
          st.add(new Strudent_LinkedList("md raja alam",23,"Nawada"));
          st.add(new Strudent_LinkedList("md atif alam",23,"Nawada"));
          st.add(new Strudent_LinkedList("md shaif alam",23,"Nawada"));
          st.add(new Strudent_LinkedList("md khalid alam",23,"Nawada"));
          

          // print the iterator
        Iterator<Strudent_LinkedList> it= st.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }






    }
}
