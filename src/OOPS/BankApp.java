package OOPS;

class Account{
    private String AccountHolderName;
    private double balance;


    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit(double amount){
    if(amount>0) {
        balance = balance + amount;
        System.out.println("You deposit : " + amount + " , Now your balance is : " + getBalance());
    }
    else {
        System.out.println("Invalid deposit");
    }
    }

    public void Withdraw(double amount) {
   if(amount>0) {
       balance = balance - amount;
       System.out.println("you Withdraw : " + amount + " , Now your Balance is : " + getBalance());
   }
   else {
       System.out.println("Invalid withdraw");

   }
    }
}

public class BankApp {
    static void main(String[] args) {

        Account obj = new Account();
        obj.setAccountHolderName("Ashish");
        obj.Deposit(100000);
        obj.Withdraw(5000);
        obj.Deposit(-2000);

    }
}
