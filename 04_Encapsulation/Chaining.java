public class Chaining {

     public  Chaining(){
        this("imran","Ashif");
        System.out.println("Default  Constructor called ");

    }

     public  Chaining( int a,int b){
        System.out.println(" Some Of Two Number: "+a+b);
        System.out.println("two Int type Argument Constructor");
    }

      public  Chaining( String s,String s2){
        this(10,50);
        System.out.println("Concat "+s+" "+s2);

        System.out.println("two String type Argument Constructor");

    }

    public static void main(String[] args) {
        
         Chaining obj= new Chaining();

    }
    
}
