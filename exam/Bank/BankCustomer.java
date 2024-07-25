package Bank;

public class BankCustomer implements Customer{
    private String customerId;
    private String name;

    public BankCustomer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    @Override
    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "BankCustomer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
