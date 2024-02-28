

public class Example_01 {

    // Create add method for int
    public void  add(int x,int y){
        int c= x+y;
        System.out.println(" sum :"+c);
    }

    // Create add method for float

    public void add(float a, float b){
        float c=a+b;
        System.out.println("sum :"+c);
    }


    // Create add method for float

    public void add(String str1, String str2){
        String str3=str1+str2;
        System.out.println("Add two string "+str3);
    }

    public static void main(String[] args) {

        Example_01 obj= new Example_01();
        obj.add(12,45);
        obj.add(45.5f,785.5f);
        obj.add("md imran ","alam");
    }
}
