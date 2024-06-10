
public class student {

    int roll;
    String name;
    String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(" Roll ="+roll);
        System.out.println(" Name ="+name);
        System.out.println("Address ="+address);
    }
    // create show method
}

class UseStudent{
    public static void main(String[] args) {

        student obj= new student();
        System.out.println(" first student");
        obj.setAddress("Gondapur Nawada");
        obj.setName("Md imran alam");
        obj.setRoll(101);
        obj.show();

        System.out.println("===========================");
        student obj2= new student();
        System.out.println("second student");
        obj2.setAddress("Gondapur Nawada");
        obj2.setName("Md furkan alam alam");
        obj2.setRoll(102);
        obj2.show();





    }
}
