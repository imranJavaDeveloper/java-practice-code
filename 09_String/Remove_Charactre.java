import javax.print.DocFlavor;
import java.sql.SQLOutput;

public class Remove_Charactre {
    public static void main(String[] args) {
        // remove a char using the StringBuffer method

        StringBuffer sb= new StringBuffer("hello");
       // System.out.println(sb.deleteCharAt(4));
        System.out.println(sb.delete(1,3));

    }
}
