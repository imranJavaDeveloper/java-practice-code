package setter_and_getter;

public class GteSet {
    // class level Variable
    private String name;

    private int roll;

    //  getter
    public String getName()
    {
        return name;
    }
    //  setter
    public void setName(String name){
          this.name=name;
    }
    // setter
    public void setRoll(int roll){
        this.roll=roll;
    }
    // getter
    public int getroll(){
        return roll;
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
        obj.setRoll(101);
        // Getting the name by calling getter method
        System.out.println(obj.getName());
        System.out.println(obj.getroll());
    }
}