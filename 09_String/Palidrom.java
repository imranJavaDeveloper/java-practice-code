
public class Palidrom {
    public static void main(String[] args) {
        // check String palindrome are not

        String name="mam";
        String rev="";

        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
            System.out.println(rev);
        }

        if(name.equals(rev)){
            System.out.println("String is palindrome "+name);
        }
        else {
            System.out.println("String is not palindrome ");
        }
    }
}
