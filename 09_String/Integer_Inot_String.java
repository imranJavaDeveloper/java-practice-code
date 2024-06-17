
import java.util.Scanner;
public class Integer_Inot_String {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a number ");
        int number =sc.nextInt();

        // convert integer into String
        String str= String.valueOf(number);

        if (number==Integer.parseInt(str)){
            System.out.println("good");
        }else {
            System.out.println("wrong");
        }
    }

}
