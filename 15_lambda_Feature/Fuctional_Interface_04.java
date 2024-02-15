
public interface Fuctional_Interface_04 {
    public void  sqrt(int n);

}
//class Test4 implements Fuctional_Interface_04 {
//
//
//    @Override
//    public void sqrt(int n) {
//        System.out.println(n*n);
//    }
//}
class Main{
    public static void main(String[] args) {
        // first square root
        Fuctional_Interface_04 obj=(int n) -> System.out.println("the square of  Number "+n+": "+n*n);
        obj.sqrt(5); // output will 25

        // second square root
        obj=(int k) -> System.out.println("the square of Number "+k+": "+k*k);
        obj.sqrt(4); // output will 16

        // third  square root
        obj=(int m) -> System.out.println("the square of Number "+m+": "+m*m);
        obj.sqrt(12); // output will 144

        // fourth  square root
        obj=(int l) -> System.out.println("the square of Number "+l+": "+l*l);
        obj.sqrt(18); // output will 324
    }
}
