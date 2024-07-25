package Bank;

public class BankTransaction implements Transaction{
    private final TransactionType type;
    private final double amount;

    public BankTransaction(TransactionType type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public void process() {
        System.out.println("이체를 시작합니다.");
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "type=" + type +
                ", amount=" + amount +
                '}';
    }
}
