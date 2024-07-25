package Bank;

public class TransactionManager <T extends Transaction, U extends Customer>{
    private final T transaction;
    private final U customer;

    public TransactionManager(T transaction, U customer) {
        this.transaction = transaction;
        this.customer = customer;
    }

    public T getTransaction() {
        return transaction;
    }

    public U getCustomer() {
        return customer;
    }

    public void displayInfo() {
        System.out.println("Transaction : " + transaction);
        System.out.println("customer : " + customer);
    }
}
