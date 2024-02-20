 
public interface Fuctional_Interface_03 {
    public void m1(int a,int b);
}
class Test3{
    public static void main(String[] args) {

        Fuctional_Interface_03 obj= (int a,int b)->{System.out.println(a+b);};
        obj.m1(10,50); // output will come 60
    }
}
