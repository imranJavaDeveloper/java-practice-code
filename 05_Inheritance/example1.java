

public class example1 {

    public int add(int a,int b){
        int c=a+b;
        return c;
    }

    public double add(double a, double b) {
       double c=a+b;
       return c;

    }
}

class Addition{
    public static void main(String[] args) {

        example1 obj= new example1();
//        obj.add(45,12);
//        obj.add(45.f,78.9f);

        System.out.println(obj.add(45,12));
        System.out.println(obj.add(45.f,78.9f));
    }
}
