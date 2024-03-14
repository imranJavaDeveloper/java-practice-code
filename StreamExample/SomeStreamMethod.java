
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

public class SomeStreamMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(44);
        list.add(44);
        list.add(96);

        // findAny()
        Optional<Integer> result=list.stream().findAny();
        System.out.println(result.get());//78

        //findFirst()
        Optional<Integer> result2= list.stream().findFirst();
        System.out.println(result2.get());//78

        boolean pri=list.stream().anyMatch((value->value>30));
        System.out.println(pri);//true

        boolean pri2=list.stream().allMatch((value->value>30));
        System.out.println(pri2);//false

        boolean pri3=list.stream().noneMatch((value->value>30));
        System.out.println(pri3); //false



        ArrayList<String> list1= new ArrayList<>();
        list1.add("one apple");
        list1.add("one guava");
        list1.add("two papaya");
        list1.add("three banana");
        list1.add("three mango");

        boolean result5= list1.stream().anyMatch(value-> value.startsWith("one"));
        System.out.println(result5); //true

        boolean result3= list1.stream().allMatch(value-> value.startsWith("one"));
        System.out.println(result3);//false

        boolean result4= list1.stream().noneMatch(value-> value.startsWith("one"));
        System.out.println(result4);//false

        //findAny()
        Optional<Integer> list2=list.stream().findAny();
        System.out.println(list2); //78
        //findFirst()
        Optional<Integer> list3=list.stream().findFirst();
        System.out.println(list3);//78




    }
}
