package generics;

public class GenericsMain1 {
    public static void main(String[] args) {
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);

    }

    // 제네릭 메서드 생성 - 호출 시 래퍼 클래스만 가능, 기본형 데이터 불가능
    // T : Type  E : Element  K : key  V : Value
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

}
