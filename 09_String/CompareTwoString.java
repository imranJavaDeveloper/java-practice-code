package 09_String;

public class CompareTwoString {
    public static void main(String[] args) {
        
        String str="core java";
        String str2="core java";
        System.out.println(str==str2);// true

        String name1=new String("platfrom indepedent");
        String name2=new String("platfrom indepedent");

        System.out.println(name1==name2);//false
        System.out.println(name1.equals(name2));//true
    }
    
    
}
