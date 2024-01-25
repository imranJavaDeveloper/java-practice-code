package Encapsulation;

public class Student {
    private String name;
    private int roll;

    private int age;

    // set method for initialize the value 
    public void setStudent(String n, int r, int a) {
        name = n;
        age = a;
        roll = r;
    }
     
    // show method for display all the data 
    public void show() {
        System.out.println("Name :" + name);
        System.out.println("Roll :" + roll);
        System.out.println("age :" + age);
    }
}
        /* create a class for creating the object  */
    class Main {
        public static void main(String[] args) {

            Student obj = new Student();
            obj.setStudent("md imran alam", 101, 26);
            obj.show();

    }
}

