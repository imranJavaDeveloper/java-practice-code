package incrementAndDecrement;

public class PostIncrementExample {


    public static void main(String[] args) {

        int a=45;
        int b= a++;


        System.out.println(b);
        System.out.println(a);


        float f=10.5f;
        float f2=f++;

        System.out.println(f);
         System.out.println(f2);


         char ch='A';
         char ch2=ch++;
        System.out.println(ch);// B
        System.out.println(ch2); //A

        
    }
}
