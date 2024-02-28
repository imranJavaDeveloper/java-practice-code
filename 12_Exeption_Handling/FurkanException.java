

public class FurkanException  extends Exception{

    public FurkanException( String name) {

        // call prent class constructor using the
        super(name);
    }
}
 class Main2{
     public static void main(String[] args) {

         try{
             throw new FurkanException("catch the furkan exception ");
         }catch (FurkanException ref){
             System.out.println("...................");
             System.out.println("====================");
         }
     }
 }