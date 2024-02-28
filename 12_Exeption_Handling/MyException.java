package Exeption_Handling;

public class MyException extends Exception{

    public MyException(String str){
        // call super constructor
        super(str);
    }
}

  class Main{
      public static void main(String [] args){
          try{
              throw new MyException("md imran alam");
          }catch (MyException e){
              System.out.println("catch our exception ");
              System.out.println(e.getMessage());
          }
      }
  }