public class Teacher {
    
    private String name;
    private int id;
    private String dep;
    private double sal;

    // create a constructor
    Teacher(String nameString,int id,String dep,double sal){
        this.name=name;
        this.id=id;
        this.dep=dep;
        this.sal=sal;
      
    }

    // create show method for display
    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("Depeartement :"+dep);
        System.out.println("Salary :"+sal);
    }
    
}

   /**
    *  InnerTeacher
    */
   public class InnerTeacher {
   public static void main(String[] args) {
    
    // create object of Teacher class
      Teacher obj= new Teacher("md imran alam", 146, "computer lab", 25000.5);
       obj.show();
   }
    
   }
