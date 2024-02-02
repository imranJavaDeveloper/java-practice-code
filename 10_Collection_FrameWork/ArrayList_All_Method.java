import java.util.ArrayList;

public class ArrayList_All_Method {
    
    public static void main(String[] args) {
        
        // create Integer ArrayList
        ArrayList<Integer> list =new ArrayList<>();
          
       // 1. Method add()
           list.add(45);
      //  2. Add the value based on specific index 
          list.add(0, 56);

      //  3.contain()
      System.out.println(list.contains(45));

      // 4. get() using this method we can print particular object
          System.out.println(list.get(0));

      // 5. remove() used for remove the object
          list.remove(45);

      // 6. remove(int index) remove based on index 
           list.remove(0);
           
      // 7. // size() give the size of ArrayList 
         System.out.println(list.size());

      // 8. clear() used for remove all object 
      // show all data using the for each loop
         for ( Integer li: list) {
            System.out.println(li);
         }
    }
}
