import java.util.ArrayList;

public class BankAccount {
    String owner;
    double balance =0;
    ArrayList<Transaction> transactions = new ArrayList<>();

    public BankAccount(String owner, double startBalance) {
        this.owner = owner;
        transactions.add(new Transaction("deposit", startBalance));
    }

    public void Deposit (double amount) {
        transactions.add(new Transaction("deposit", amount));
    }

    public void Withdraw (double amount) {
        transactions.add(new Transaction("withdraw", amount));
    }

    public void transactionHistory() {
        for(int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }

    public void getBalance() {

        for (int i = 0; i < transactions.size(); i++) {
            Transaction x = transactions.get(i);
            if (x.type == "deposit") {
                balance = this.balance + x.amount;

            }
            if (x.type == "withdrawal") {
                balance = this.balance - x.amount;
            }
        }
        System.out.println(balance);
    }
}
