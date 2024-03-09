public class VariableType {

    // class level variable
       String name;

       public void setName(String name){
        this.name=name;
       }

       public String getName(){
         return getName();
       }
    // static variable

      public static int a=10;
    public static void main(String[] args) {
        // Local variable
            
        int num=78;

        VariableType obj= new VariableType();
           // Instance variable call After the create object of a class
             obj.setName("md imran alam");
            System.out.println( obj.getName());
        
    }
}
