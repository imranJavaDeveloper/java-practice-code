public class OrderOfParameters {
    
    public void show(int n ,String s){
        System.out.println("overloading based on parameter");
        System.out.println(" inter number :"+n+" String Data type:"+s);
    }

    public void show(String s,int n){
        System.out.println("String datatype :"+s+"integre number :"+n);
    }
}
