

public class Find_Square {

    public int square(int a){
        int b=a*a;
        System.out.println(" the Square of a :"+b);
        return b;
    }


    public  float square(float x){
        float z=x*x;
        System.out.println("the square of x :"+z);
        return z;
    }

    public static void main(String[] args) {

        Find_Square obj= new Find_Square();
        obj.square(5);
        obj.square(45.5f);
    }
}
