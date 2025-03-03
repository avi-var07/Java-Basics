import java.util.Scanner;

class Account {
    String accno;
    double balance;

    Account(String accno, double balance) {
        this.accno = accno;
        this.balance = balance;
    }

    final void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    final void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void CalInt() {
        System.out.println("Calculating interest");
    }
}

class SavingAccount extends Account {
    double rate = 3;

    SavingAccount(String accno, double balance) {
        super(accno, balance);
    }

    void CalInt() {
        System.out.println("Interest: " + (balance * rate / 100));
    }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number and initial balance:");
        String accno = sc.nextLine();
        double balance = sc.nextDouble();

        SavingAccount sa = new SavingAccount(accno, balance);

        System.out.println("Enter choice: 1. Deposit 2. Withdraw");
        int choice = sc.nextInt();
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                sa.deposit(amount);
                break;
            case 2:
                sa.withdraw(amount);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        System.out.println("Account number: " + sa.accno);
        System.out.println("Balance: " + sa.balance);

        sa.CalInt();
        sc.close();
    }
}
