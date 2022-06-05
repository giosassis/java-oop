public class CreateAccount {
    public static void main(String[] args) {
        CheckingAccount firstAccount = new CheckingAccount();
        firstAccount.balance = 200;
        System.out.println(firstAccount.balance);
    }
}