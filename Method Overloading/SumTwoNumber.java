
public class SumTwoNumber {

    // add two integer
    public void add(int a,int b){
        int c=+ a+b;
        System.out.println("sum of two int number :="+c);
    }

    // add two float
    public void add(float a,float b){
        float c=+ a+b;
        System.out.println("sum of two float number :="+c);
    }

    // add two String
    public void add(String s1,String s2){
        String s3=s1+s2;
        System.out.println("sum of two string :="+s3);
    }

    public static void main(String[] args) {

        SumTwoNumber obj= new SumTwoNumber();
            obj.add(45,24);
            obj.add(457.4f,589735.25f);
            obj.add("furkan","alam");

        System.out.println("Thank you for solving this problem");

    }
}
