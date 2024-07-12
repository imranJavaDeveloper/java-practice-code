
public class MathUtil {

    // overloading with different Return type
    int add(int a,int b){
        return a+b;
    }
    double add(float a, float b){
        return a+b;
    }

    String add(String s1,String s2){
        return s1+s2;
    }

    public static void main(String[] args) {

        MathUtil mathUtil= new MathUtil();
        System.out.println("sum of two int :"+mathUtil.add(47,25));
        System.out.println("sum of two float :"+mathUtil.add(458.5f,785.25f));
        System.out.println("sum of two String :"+mathUtil.add("furkan","alam"));
    }
}
