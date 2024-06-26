package lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {

        Integer il = Integer.valueOf(10); // 숫자, 래퍼 객체 변환
        Integer i2 = Integer.valueOf("10"); // 문자열, 래퍼 객체 변환
        int intValue = Integer.parseInt("10"); // 문자열 전용, 기본형 변환

        // 비교
        int compareResult = il.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        // 산술 연산
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }

}

/*
valueOf : 래퍼 타입 반환, 숫자 문자열 모두 지원
parseInt : 문자열을 기본형으로 변환
compareTo : 내 값과 인수로 넘어온 값을 비교, 내 값이 크면 1, 같으면 0, 적으면 -1 반환
Integer.sum(), min(), max() : static 메서드, 간단한 덧셈, 작/큰 값 연산 수행


 */