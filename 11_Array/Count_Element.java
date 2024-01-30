
public class Count_Element {
    public static void main(String[] args) {

        // create an integer array

        int arr[]={10,20,30,40,50,60,40,50,70};
        int num=20;
        //lets say we want to check how many elements are less than that particular element. Eg. 40

       System.out.println(findCountLessThan(arr,num));
    }

     public static int findCountLessThan(int a[], int n)
     {
         int count=0;
         for(int i=0;i<a.length;i++)
         {
             if(a[i]<n)
                 count++;

         }
         return count;
     }
}
