package enumeration.ref3;

public class EnumRefMain3_2 {

    public static void main(String[] args) {

        // 3_1에서 반복되는 것들을 메서드로 구현
        int price = 10000;

        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액 = " + grade.discount(price));
    }
}
