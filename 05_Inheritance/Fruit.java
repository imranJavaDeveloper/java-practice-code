public class Fruit {

    public void taste(){
        System.out.println("sweet");
    }
    
}
/**
 *  
 */
 class Grapes  extends Fruit {
     
    // overriding parent class method 
    public void taste(){
        System.out.println("Citrus");
    }
    
}

/**
 * Main
 */
 class Main {

    public static void main(String[] args) {
        Grapes obj= new Grapes();
        obj.taste(); 
    }
}
