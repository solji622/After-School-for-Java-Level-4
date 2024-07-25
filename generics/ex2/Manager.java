package generics.ex2;

public class Manager <U, P>{
    public U user;
    public P product;

    public Manager(U user, P product) {
        this.user = user;
        this.product = product;
    }

    public U getUser() {
        return user;
    }

    public P getProduct() {
        return product;
    }

    public void displayInfo() {
        User name = (User) getUser();
        Product product = (Product) getProduct();
        System.out.println("user: " + name.getName());
        System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
    }
}
