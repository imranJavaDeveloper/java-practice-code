public class StringBufferMethod {

    public static void main(String[] args) {
        

        StringBuffer str= new StringBuffer("md");
        StringBuffer str2= new StringBuffer("Imran");
        StringBuffer str3= new StringBuffer("Alam");

        // 1 public int lenght()
        System.out.println(str.length());
        System.out.println(str2.length());
        System.out.println(str3.length());

        // 2.append ()

        StringBuffer sb=(str.append(str2));
        System.out.println(sb.append(str3));
        

    }
}