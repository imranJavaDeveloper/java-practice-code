
public class Search_Element {

    public static void receive(int number[],int key) {
        int count=0;
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

            if (number[i]==key){
               count++;
            }
        }
        System.out.println();
        System.out.println(key+" :"+count);
    }
    public static void main(String[] args) {

        int number[]= {10,20,30,45,45,45,45,45,78,78,78,24,65};
        int key=45;
        int key2=78;

        receive(number,key);



    }
}
