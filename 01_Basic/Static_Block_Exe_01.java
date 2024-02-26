

import java.util.Scanner;

public class Static_Block_Exe_01 {

    private int id;
    private String name;
    private double balance;
    private static double rOfInt;
    static {
        System.out.println(" enter rate of interest ");
         Scanner sc= new Scanner(System.in);
         rOfInt =sc.nextDouble();
    }

    public Static_Block_Exe_01(int id ,String name,double balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    // create a method for display the result
    public void display(){
        System.out.println(" id :"+id+"  Name :"+name+"  balance"+balance);
    }

    public static void main(String[] args) {
        Static_Block_Exe_01 obj= new Static_Block_Exe_01(101,"Md Imran Alam",44500);
        obj.display();
        Static_Block_Exe_01 obj2= new Static_Block_Exe_01(102,"Rahat Ali",44500);
        obj.display();
        Static_Block_Exe_01 obj3= new Static_Block_Exe_01(103,"Md Raja Alam",44500);
        obj.display();
    }
}
