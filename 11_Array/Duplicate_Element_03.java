
import java.util.LinkedHashSet;

public class Duplicate_Element_03 {
    public static void remove(int arr[]){

        // create linkedHas set

        LinkedHashSet<Integer> has= new LinkedHashSet<>();
        for (int i=0;i<arr.length;i++){
            has.add(arr[i]);
        }
        System.out.println();
        System.out.println("remove duplicate element ");
        System.out.println(has);
    }

    public static void main(String[] args) {
        // remove duplicate value form the array

        int arr[]={10,20,30,50,45,05,2,55,5,5,2,2,5,2};

        // find the maximum value int the array

        int max=arr[0];

        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }

        // find min value
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        // print max value
        System.out.println("MAX_Value :"+max);
        System.out.println("MIN_VALUE :"+min);


        // preform bubble sorting

        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){

                if (arr[j]> arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println(" sorting done");

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        // start remove element
        remove(arr);
    }
}
