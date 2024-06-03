package Operator;

public class LogicalOperator2{
    public static void main(String args[]){

         // logical operator example

         int a=78,b=25,c=36;

         // Example of &&(And) Operator
         System.out.println((a>b) && (a>c));//true
         System.out.println((a>b) && (a<c));//false
         System.out.println((b>a) && (b>c));//false
         System.out.println((c>a) && (c>b));//false
 
         // Example of ||(Or) Operator

         System.out.println((a>b) ||(a>c));//true
         System.out.println((a>b) || (a<c));//true
         System.out.println((b>a) || (b>c));//false
         System.out.println((c>a) || (c>b));//true
 
         // Example of !(Not) Operator

         System.out.println(!(a>b)); //false
         System.out.println(!(a<b)); // false
         System.out.println(!(c<a));// false
         System.out.println(!(c>a));// ture


    }
}