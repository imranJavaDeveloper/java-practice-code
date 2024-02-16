
public class Largest_Element {

    // find the big and small value in the Array
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]+" ");
            if (largest < number[i]) {
                largest = number[i];
            }
            if (small>number[i]){
                 small=number[i];
            }
            System.out.println("small value :"+small);
        }return largest;
    }

    public static void main(String[] args) {

        int number[]= {10,45,26,35,626,2625,626,26};
        //getLargest(number);

        System.out.println("largest value :"+getLargest(number));

    }
}
