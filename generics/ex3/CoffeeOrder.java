package generics.ex3;

public class CoffeeOrder <T> {
    public T customer;
    public String coffeeName;

    public CoffeeOrder(T customer, String coffeeName) {
        this.customer = customer;
        this.coffeeName = coffeeName;
    }

    public T getCustomer() {
        return customer;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void displayOrder() {
        Customer customer = (Customer) getCustomer();
        System.out.println("Customer: " + customer.getName());
        System.out.println("Coffee: " + coffeeName);
    }
}
