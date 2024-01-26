import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    System.out.println("enter the size of array");
    int size= sc.nextInt();

       // create array
       int array[]= new int[size];

       int sum=0;

       // input in array one by one 
       for(int i=0;i<array.length;i++){

        array[i]=sc.nextInt();

       }
       // show all the data 
       for(int x :array){
         sum=array[x];
        System.out.println(x);
       }
       System.out.println("sum of all array="+sum);
}    }
    

