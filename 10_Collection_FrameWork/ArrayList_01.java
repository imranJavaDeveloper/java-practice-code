
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_01 {
    public static void main(String args[]){

// Q1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
        ArrayList<String> list= new ArrayList<>();
        list.add("Black");
        list.add("white");
        list.add("pink");
        list.add("Maroon");
        
        list.add("Brown");
        list.add("Green");

        // print all colors name one by one Using the iterator

        Iterator<String> it= list.iterator();
         while (it.hasNext()){
             System.out.println(it.next());
         }
    }
}
