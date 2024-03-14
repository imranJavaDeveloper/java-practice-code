
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExe1 {
    public static void main(String[] args) {

        ArrayList<String> vehicles= new ArrayList<>();
        // All element in the ArrayList
        vehicles.add("car");
        vehicles.add("bus");
        vehicles.add("bike");
        vehicles.add("range rover");
        vehicles.add("suv");


        System.out.println(" all string in lower case");
        System.out.println(vehicles);
        // convert all string in upper case

        List<String> vehicles2=vehicles.stream().map(m->m.toUpperCase()).collect(Collectors.toList());

        // print all screen in upper case
        System.out.println("all string in upper case ");
        System.out.println(vehicles2);
        System.out.println("thank you");
    }
}
