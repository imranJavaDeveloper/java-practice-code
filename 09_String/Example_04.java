
public class Example_04 {
    public static void main(String[] args) {

        // creating the String

        String str= new String("Spring");
         str=str.concat("fall");

        String str2= str.concat("Winter");
        str2.concat("Summer");

        System.out.println(str);
        System.out.println(str2);

        System.out.println(str);
        String name=new String("imran");
        String name2="imran";

        System.out.println(name==name2);
        System.out.println(name.equals(name2));
    }
}
