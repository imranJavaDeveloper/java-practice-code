package setter_and_getter;

public class Student {
    
    private String name;
    private int roll;
    private float percentage;
    private String college_Name;


    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll()
    {
        return roll;
    }

    public void setRoll(int roll)
    {
        this.roll = roll;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage)
    {
        this.percentage = percentage;
    }

    public String getCollege_Name() {
        return college_Name;
    }

    public void setCollege_Name(String college_Name) {
        this.college_Name = college_Name;
    }
    // creating show method for display the value

    public void show(){
        System.out.println("Name :"+name);
        System.out.println("Roll :"+roll);
        System.out.println("Percentage :"+percentage);
        System.out.println("College Name :"+college_Name);
    }

}
 class UseSetter_getter{
     public static void main(String[] args) {

         // Creating first object
         Student  object=new Student();
         object.setName("md imran alam");
         object.setRoll(40);
         object.setPercentage(78.8f);
         object.setCollege_Name("Patel College Science And Technology Bhopal");
         object.show();

         // creating the second object
         Student object2=new Student();
         object2.setName("md furkan alam");
         object2.setRoll(41);
         object2.setPercentage(80.8f);
         object2.setCollege_Name("Patel College Science And Technology Bhopal");
         object2.show();

         // creating the third object
         Student object3=new Student();
         object3.setName("md imran alam");
         object3.setRoll(40);
         object3.setPercentage(78.8f);
         object3.setCollege_Name("Patel College Science And Technology Bhopal");
         object3.show();


     }
 }



