public class CallMethod {
    public static void main(String[] args) {

        CheckingAccount testingAccount = new CheckingAccount();

        testingAccount.balance = 100;
        testingAccount.deposit(50);
        System.out.println(testingAccount.balance);

        testingAccount.withdrawMoney(20);
        System.out.println(testingAccount.balance);

        CheckingAccount helperAccount = new CheckingAccount();
        
        helperAccount.deposit(1000);
        helperAccount.transferMoney(300, testingAccount);
        
        System.out.println(helperAccount.balance);
        System.out.println(testingAccount.balance);
    }
}
