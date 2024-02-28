
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class Search_Element_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of Array");
        int size=sc.nextInt();
        
        // create Actual Array
        String name[]= new String[size];

        // create for loop for accepting all string
        System.out.println("enter name one by one");
        for (int i=0;i<name.length;i++){
            name[i]=sc.nextLine();
        }
        System.out.println("=========================");

        // print all element
        for (int j=0;j<name.length;j++){
            System.out.println(name[j]);
        }
        System.out.println("============================");
        // enter the name for Search
        System.out.println("enter the name for search");
        String search=sc.nextLine();

        for (int i=0;i<name.length;i++){
            if (name[i].equals(search)){
                System.out.println("Name is found : "+search);
            }
        }

    }
}
