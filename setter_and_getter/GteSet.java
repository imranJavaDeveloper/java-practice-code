package setter_and_getter;

public class GteSet {
    // class level Variable
    private String name;

    //  method 1 getter
    public String getName()
    {
        return name;
    }
    //  method 2 setter
    public void setName(String name){
          this.name=name;
    }
}

 // Class 2
// Main class
class GFG extends GteSet {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of class 1 in main() method
        GteSet obj = new GteSet();
 
        // Setting the name by calling setter method
        obj.setName("Geeks for Geeks");
        // Getting the name by calling getter method
        System.out.println(obj.getName());
    }
}