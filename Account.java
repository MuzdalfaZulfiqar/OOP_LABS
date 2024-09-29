public class Account {
    private int balance;
    Account(){
        balance = 0;
    }
    Account(int b){
        balance = b;
    }
    public void setBalance(int b){
        balance = b;
    }
    public int getBalance(){
        return balance;
    }
    public void withdrawAmount(int amount){
        System.out.println("Balance before withdraw : "+balance);
        balance  = balance-amount;
        System.out.println("Balance after withdraw : "+balance);
    }
    public void depositAmount(int amount){
        System.out.println("Balance before Deposit : "+balance);
        balance  = balance+amount;
        System.out.println("Balance after Deposit : "+balance);
    }
}// Class ends here
