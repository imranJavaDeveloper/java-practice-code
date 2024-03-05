public class LogicalOperator {
    public static void main(String[] args) {
        
    // Logical Operator
          int a=78, b=25, c=56;

    // Logical(And &&)  
       System.out.println((a>b) && (a>c));
       System.out.println((b>a) && (b>c));
       System.out.println((c>a) && (c>b));
       System.out.println((a>b) && (b<c));

       // Logical (or ||)

       System.out.println((a>b) || (a>c));
       System.out.println((b>a) || (b>c));
       System.out.println((c>a) || (c>b));
       System.out.println((a>b) || (b<c));

       // Logical (! not)

       System.out.println(!(a>b));
       System.out.println(!(b>a));
       System.out.println(!(c>a));
       System.out.println(!(c<b));
    }
    
}
