
public interface Fuctional_Interface_05 {
    public int m3(int n);
}

class InnerTest5 {
    public static void main(String[] args) {


        Fuctional_Interface_05 obj=  n->n*n;
        System.out.println(obj.m3(5));
    }
}
