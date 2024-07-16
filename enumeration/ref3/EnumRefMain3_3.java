package enumeration.ref3;

public class EnumRefMain3_3 {

    public static void main(String[] args) {

        // 3_1에서 반복되는 것들을 메서드로 구현
        // 반복되는 메서드 호출은 배열 선언과 for each로
        int price = 10000;

        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액 = " + grade.discount(price));
    }
}
