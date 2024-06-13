public interface Account {
  public void deposit(double amount);

  public void withdraw(double amount);
  public double getBalance();
}

/**
 * Account
 */
 class SavingsAccount implements Account {
    private double balance;
    private double rateOfInterst;

    public SavingsAccount(double initialDeposit, double rateOfInterst ){
        this.rateOfInterst=rateOfInterst;
        this.balance=initialDeposit;
    }

    public void deposit(double amount){
        balance+=amount;

    }

    public void withdraw(double amount){
     balance=-amount;
    }
    public double getBalance(){
        return balance;
    }

    public void applyInterst(){
        balance+=balance*rateOfInterst/100;
    }
    
}
