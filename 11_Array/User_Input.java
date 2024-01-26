import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class User_Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // size input from the user 
        System.out.println("enter the size of the array");
        int size= sc.nextInt();

        // creating aaray
        int [] array=new int[size];

        // input in array using the for loop
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        // display all element 

        for(int x: array){
            System.out.println(x);
        }


    }
    
}
