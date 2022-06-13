public class CheckingAccount {
    double balance; 
    int bank;
    int number;
    String owner;
    public char[] deposit; 

    public void deposit(double value) {
        this.balance = this.balance + value;
    }

    public boolean withdrawMoney(double value) {
        if(this.balance >= value) { 
            this.balance -= value;
            return true;
    }

    public boolean transferMoney(double value, CheckingAccount destiny ) {
        if(this.balance >= value) { 
            this.balance -= value;
            destiny.deposit(value);
            return true;
        }
    }
}