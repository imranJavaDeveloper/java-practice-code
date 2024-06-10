
public class BankAccount {
  /* declare three instance variable */
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    /* Set Account Number */
      public void setAccountNumber(String accountNumber){
          this.accountNumber=accountNumber;
      }
    /* Set Account Balanace */
      public void setBalance(double balance){
          this.balance=balance;

      }
    /* Set Account Holder Name */
      public void setAccountHolderName(String accountHolderName){
          this.accountHolderName=accountHolderName;
      }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName(){
          return accountHolderName;
    }
    public double getBalance(){
          return balance;
    }
}

class  UseBankAccount{
    public static void main(String[] args) {

        BankAccount obj= new BankAccount();
        System.out.println(" First user detail ");
    
        obj.setBalance(45152.5);
        
        obj.setAccountNumber("SB-09876");
      
        obj.setAccountHolderName("MD IMRAN ALAM");
        obj.setBalance(45522.54);
      /* print all the user detail  */
        System.out.println(obj.getAccountHolderName());
        System.out.println(obj.getAccountNumber());
        System.out.println(obj.getBalance());


        System.out.println("===============================");

        System.out.println("second user detail");
        BankAccount obj2= new BankAccount();
        
        obj2.setBalance(45152.5);
       
        obj2.setAccountNumber("SB-09456");
      
        obj2.setAccountHolderName("MD FURKAN ALAM");
        obj2.setBalance(100000.54);

        /*print all user detail*/
        System.out.println(obj2.getAccountHolderName());
        System.out.println(obj2.getAccountNumber());
        System.out.println(obj2.getBalance());

    }
}