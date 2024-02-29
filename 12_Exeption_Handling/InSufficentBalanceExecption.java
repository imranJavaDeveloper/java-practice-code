
import java.util.Scanner;

public class InSufficentBalanceExecption extends Exception{


    public InSufficentBalanceExecption(String s) {
        super(s);
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int balance =500;

        System.out.println(" your present balance :"+balance);
        System.out.println("===============================");
        System.out.println(" enter amount for withdraw ");
        int amount=sc.nextInt();
        try{
            if (amount>balance){
                throw new InSufficentBalanceExecption("InsufficentBalance ");
            }
        }catch (InSufficentBalanceExecption e){
            System.out.println("Insufficencet balance ");
        }

        if (balance>=amount){
             int current =balance-amount;
            System.out.println("money debit :"+amount);
            System.out.println("=============================");
            System.out.println("current balance after deposite :"+current);
        }
        System.out.println("================");
        System.out.println("thanks you");
    }
}
