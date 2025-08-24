class BankAccount {
    String accountName;
    double balance;

    BankAccount(String name, double bal) {
        accountName = name;
        balance = bal;
    }

    void deposit(double amount) {

        if (amount == 0) {
            System.out.println("You cannot deposit 0 amount in balance");
        } else if (amount < 0) {
            System.out.println("OOps! You enter the negative amount, Please wash your eyes");
        } else {
            balance += amount;
        }
    }

    void deposit(BankAccount a, double money) {
        if (balance >= money) {
            balance -= money;
            a.balance += money;
        } else {
            System.out.println("The " + a.accountName + "has not enough moneY to transfer");
        }
    }

    void ShowBankDetails() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Balance: " + balance);
        System.out.println();
    }

}

public class Task_5 {
    public static void main(String arg[]) {
        System.out.println("Md. Nafijur Rahaman\n\n");

        BankAccount b1 = new BankAccount("Tanjid_savings", 1000);
        BankAccount b2 = new BankAccount("Nafis_savings", 500);

        System.out.println("After deposit both accounts\n");

        b1.ShowBankDetails();
        b2.ShowBankDetails();

        System.out.println("Transfer money from " + b1.accountName + " to " + b2.accountName + "\n");

        b1.deposit(b2, 100);

        b1.ShowBankDetails();
        b2.ShowBankDetails();

        System.out.println("\n\nId: 20234103116");
    }
}
