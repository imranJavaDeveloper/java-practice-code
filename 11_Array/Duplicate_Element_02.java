
import java.util.LinkedHashSet;

public class Duplicate_Element_02 {
   public static void remove(int arr[]){

       // create linkedHas set
       LinkedHashSet<Integer> has= new LinkedHashSet<>();

       for (int i=0;i<arr.length;i++){
           has.add(arr[i]);
       }

       // check max value
       System.out.println();
       System.out.println("remove duplicate value from the outside ");

       System.out.println(has);


   }
    public static void main(String[] args) {
        // remove duplicate value

        int arr[]= {10,20,30,1,02,5,85,5,5,4,55};
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }

        }
      // find the max value
        System.out.println(" max value is :"+max);

        // sorting the array using bubble sort

        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){

                if (arr[j]> arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        System.out.println("original value ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        remove(arr);
    }
}
