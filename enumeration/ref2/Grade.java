package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);
    
    private final int discountPercent;
    
    Grade(int discountPercent) { // 기본적으로 private으로 선언
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
