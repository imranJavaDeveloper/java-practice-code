
public class Constructor_Chaining_2 {

    Constructor_Chaining_2(){
    this(5);
        System.out.println("constructor called");
    }
    Constructor_Chaining_2(int x){
        this(5,6);
        System.out.println("the value os x :"+x);
    }

    Constructor_Chaining_2(int x,int y){

        System.out.println(x*y);
    }

    public static void main(String[] args) {
        Constructor_Chaining_2 obj= new Constructor_Chaining_2();
    }
}
