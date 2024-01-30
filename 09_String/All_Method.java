package String.com.furkan;

import java.sql.SQLOutput;

public class All_Method {
    public static void main(String[] args) {

        String name="furkan";
        String name2="furkan";

        String name3= new String("furkan");
        String name4= new String("furkan");
        System.out.println(name2==name);//true
        System.out.println(name3==name4);//false

        String s= new String("durga");
        s.concat("software");
        s=s.concat("sloution");

        System.out.println(s);// durga soluction

        String str1=new String("spring");
        name.concat("fall");
        String str2=name.concat("boot");
        name2.concat("heeeey");

        System.out.println(name);//spring
        System.out.println(name2);//spring boot
        String str="furkan";
        String str3="furkan";

        // Find the Length of the String
        System.out.println(str.length());//6

        // we can get a char using its index
        System.out.println(str.charAt(5));//n

        // Compare two string using (==) operator
        System.out.println(str==str3);//true

        // Compare two string using equal()
        System.out.println(str.equals(str2));// true

        // Compare two string using equalIgnoreCase()
        System.out.println(str.equalsIgnoreCase(str2));//true

        // Replace a character using the replace()
        System.out.println(str.replace('f','i'));//iurkan

        // get character index using indexOf()
        System.out.println(str.indexOf('f'));//0


         // get some character from the string using the substring method
        System.out.println(str.substring(2));//rkan
        System.out.println(str.substring(1,4));// urk

         // convert the String lower case using toLowerCase()
        System.out.println(str.toLowerCase());//furkan

        // convert the String upper case using the toUpperCase()
        System.out.println(str.toUpperCase());//FURKAN
        System.out.println(str.isEmpty());//false


    }
}
