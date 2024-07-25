package Bank;

public class Main {
    public static void main(String[] args) {
        BankTransaction transaction = new BankTransaction(TransactionType.DEPOSIT, 1000.00);
        BankCustomer customer = new BankCustomer("C12345", "John Doe");

        TransactionManager<BankTransaction, BankCustomer> manager = new TransactionManager<>(transaction, customer);

        transaction.process();

        manager.displayInfo();
    }
}
