public class BankAccount
{
   protected String account;
    protected double balance=0;

    BankAccount(String account, double balance)
    {
        this.account= account;
        this.balance= balance;
    }

    protected  void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.print("Amount deposited is: " + balance);
        } else {
            System.out.print("Invalid amount entered. Try again");
        }
    }
        protected void withdraw ( double amountt)
        {
            if (amountt > 0 && amountt <= balance) {
                balance -= amountt;
                System.out.print("Amount withdraw is: " + balance);
            } else {
                System.out.print("Invalid amount entered. Try again");
            }
    }
    public void showbal()
    {
if(balance!=0)
{
    System.out.print("Available balance is :"+balance);

}
else {
    System.out.print("Avaiable balance is either 0 or wrong command entered.");
}
    }
//@override
//    public String toString()
//    {
//        return "Account Name: "+account+ "Balance"+balance;
//    }
}
