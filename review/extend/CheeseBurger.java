package review.extend;

public class CheeseBurger extends HamBurger{
    public CheeseBurger() {
        super("치즈버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}
