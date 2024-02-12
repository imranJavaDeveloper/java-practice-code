public class StringBufferExe {
    public static void main(String[] args) {
        
        // Create String buffer object 
         StringBuffer sb= new StringBuffer();
             sb.append("hello");
             sb.append(" ");
             sb.append("world");

             String ouput=sb.toString();
             System.out.println(ouput);
    }
    
}
