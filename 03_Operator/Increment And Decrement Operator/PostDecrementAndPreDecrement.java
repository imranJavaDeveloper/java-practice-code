
public class PostDecrementAndPreDecrement {

    public static void main(String[] args) {

        /// post decrement operator example

        int x=45;
        int x2=x--;

        System.out.println(x);//44
        System.out.println(x2);//45


        /// post decrement operator example Apply on char data type

        char ch='B';
        char ch2=ch--;

        System.out.println(ch);//A
        System.out.println(ch2);//B


        /// pre-decrement operator example
        int var1=87;
        int var2=--var1;

        System.out.println(var1);//86
        System.out.println(var2);//86



        char ch3='B';
        char ch4=--ch3;

        System.out.println(ch3);//A
        System.out.println(ch4);//A


    }
}
