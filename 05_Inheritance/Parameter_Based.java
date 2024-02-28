
public class Parameter_Based {

    // two method same data type but parameter is different

    public int add(int a,int b){

        int c=a+b;
        return c;
    }

    public int add(int j,int k,int l){
        int m=j+k+l;
        return m;
    }
    public float add(float first,float second){
        float third=first+second;
        return third;
    }

    public String add(String str,String str2){
        String str3=str+str2;
        return str3;
    }

    public static void main(String[] args) {
        Parameter_Based obj=new Parameter_Based();

        System.out.println("adding two int value="+obj.add(45,78));
        System.out.println("adding three int value="+obj.add(45,45,45));
        System.out.println("adding two float value="+obj.add(4578.5f,55885.45f));
        System.out.println("adding two string value="+obj.add("hello","imran"));
        }

}
