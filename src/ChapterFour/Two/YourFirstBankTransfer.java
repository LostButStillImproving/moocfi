package ChapterFour.Two;

public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account account = new Account("Matthews account", 100.0);
        Account account2 = new Account("My account", 0);

        account.withdrawal(100.0);
        account2.deposit(100.0);

        System.out.println(account);
        System.out.println(account2);



    }
}
