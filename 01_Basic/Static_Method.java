
public class Static_Method {

    public static boolean mi(){
        System.out.println("static block called");
        return false;
    }
    public void m2(){
        System.out.println("non static block called");
    }
}

class UseStatic_Method{
    public static void main(String[] args) {
        System.out.println(Static_Method.mi());

        Static_Method obj=new Static_Method();
        obj.m2();
    }
}
