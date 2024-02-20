
public  interface Fuctional_Interface_02 {
   public void m1();
}
//class Demo implements Fuctional_Interface_02{
//
//    @Override
//    public void m1() {
//        System.out.println("method first called");
//    }
//}
class Test2 {
    public static void main(String[] args) {

//        // create object for the purpose calling method
//        Demo d= new Demo();
//           d.m1();

        // first object
        Fuctional_Interface_02 obj= ()-> System.out.println("hello");
             obj.m1();

        // second method 
          obj=()->{
              System.out.println("second method called ");
              System.out.println("second method called ");
              System.out.println("second method called");
              System.out.println("second method called");
          };

          obj.m1();


               // this is called functional interface
               // we can call method without  create the object

    }
}