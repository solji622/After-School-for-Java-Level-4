package enumeration.ref1;

public class ClassGradeRefMain {

    public static void main(String[] args) {
        
        int price = 10000;
        
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);

        System.out.println("basic = " + basic);
    }
}
// 엄청난 리팩토링! 이것은 놀라운!