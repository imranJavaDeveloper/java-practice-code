
public class Array_Alternate_Element {
    public static void main(String[] args) {

        // find the alternate element

        int [] arr={10,20,30,40,50,50,60,70,70,50};


        for (int i=0;i<arr.length;i=i+2){

            // print element one after one
            System.out.print(arr[i]+" ");
        }
    }
}
