package uncheckedException;

import java.util.Scanner;

public class BankApplication {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter total balance ");
        double totalBalance=sc.nextDouble();

        System.out.println("enter amount for withdraw");
        double withdraw=sc.nextDouble();


        // suppose i want to take our money form bank

        if (totalBalance>withdraw){
            System.out.println("you can withdraw money from bank");
        }

        if (totalBalance<withdraw){
            throw new InSufficentBalance("InSufficentBalance");
        }
    }
}



class InSufficentBalance extends RuntimeException{

    public InSufficentBalance(String s){
        super(s);
    }
}