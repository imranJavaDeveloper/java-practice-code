package execption_handling;

public class Throws_Keyword_02 {

    // create a static method
    public static void m1(int a,int b){

           if(b==0){
               throw new ArithmeticException();
           }
           else {
                int c=a/b;
               System.out.println(" division : "+c);
           }
    }

    public static void main(String[] args) {


        // cll m1 method and pass two value
        //m1(10,0); // give  ArithmeticException
        m1(20,5);// 4
    }
}
