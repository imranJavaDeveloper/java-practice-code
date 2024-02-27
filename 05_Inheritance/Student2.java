
public class Student2 {

    // instance variable
    String name;
    int roll;

    // constructor
    Student2(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
}

class Teacher extends Student2{

    double salary;

   Teacher(String name, int roll,double salary) {
        super(name,roll);

        this.name=name;
        this.salary=salary;
        this.roll=roll;
    }

    Teacher(String name, int roll) {
        // call parent call instace variable using super
        super(name, roll);
    }

    // create show method
    public void show(){
        System.out.println("Name :"+name);
        System.out.println("salary :"+salary);
        System.out.println("Roll :"+roll);
    }

    public static void main(String[] args) {

        Teacher obj= new Teacher("md imran alam",101,45000);
        obj.show();
        System.out.println("================================");
        Teacher obj2= new Teacher("md Raza alam alam",102,45800);
        obj.show();

    }

}
