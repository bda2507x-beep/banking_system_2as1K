public class Account {
    private String AccountNumber ;
    private double balance ;

    public Account (String AccountNumber , double balance ){
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return AccountNumber ;
    }
    public double getbalance(){
        return balance ;
    }
    public void deposit(double amount ){
        balance += amount ;
    }
    public String toString (){
        return "Account{number='" + AccountNumber + "', balance=" + balance + "}";
    }
}
