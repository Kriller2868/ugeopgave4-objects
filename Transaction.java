public class Transaction {
    String type;
    double amount;
    private int tID;
    static private int count = 1;


    //Constructer
    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.tID = count++;
    }


    @Override
    public String toString() {
        String t = this.type;
        return this.type + " beløb på:  " + this.amount + " kr";
    }
}
