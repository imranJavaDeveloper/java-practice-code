
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Example3 {

    public static void main(String[] args) {

        ArrayList<Object> fruits = new ArrayList<>();

        fruits.add("imran");
        fruits.add(45);
        fruits.add(21.5);

        Object [] arr= new Object[3];
        arr[0]="imran";
        arr[1]=45;
        arr[2]=45.2;

        for (int i=0;i<1;i++){
            if (arr[0] instanceof String){
                System.out.println("this Object IS String Type"+arr[0]);
            }
            if (arr[1] instanceof Integer){
                System.out.println("this object is integer type" +arr[1]);
            }
            if (arr[2] instanceof Double){
                System.out.println("This object is double type"+arr[2]);
            }
        }



        for (Object item : fruits) {
            if (item instanceof String) {
                System.out.println(item + " is a String");
            } else if (item instanceof Integer) {
                System.out.println(item + " is an Integer");
            } else if (item instanceof Double) {
                System.out.println(item + " is a Double");
            } else {
                System.out.println(item + " is some other type");
            }

        }
    }
}
