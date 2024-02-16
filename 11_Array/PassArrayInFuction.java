
public class PassArrayInFuction {

    // create a function for receive array as a argument
    public static void receive(int marks[]){

        // increase all array element by 2
        for (int i=0;i< marks.length;i++){
            marks[i]=marks[i]+2;
            System.out.print(marks[i]+" ");
        }

    }
    public static void main(String[] args) {

        // create an array
        int count=0;
        int [] marks={10,20,30,50,40,50};

        // print all element before increase the value
        for (int i=0;i<marks.length;i++){
            count++;
            System.out.print(marks[i]+" ");
        }
         System.out.println();

        // print after increase the value
        System.out.println("print all element after increase by 2");
        // pass array as a argument
        receive(marks);

        System.out.println();
        System.out.println("total element present in the Array :"+count);
    }
}
