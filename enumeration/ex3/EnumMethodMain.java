package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        
        // 모든 Enum 반환 -> .values()
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }
        
        //  String -> enum 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // toString() 오버라이딩 가능

        /*
        1. Arrays.toString() : 배열의 참조값이 아니라 배열 내부의 값을 출력할 때 사용
        2. values() : 모든 enum 상수를 포함하는 배열을 반환한다
        3. name() : enum 상수의 이름을 문자열로 반환한다
        4. ordinal() : enum 상수의 선언 순서(0부터 시작) 반환한다
        5. toString() : enum 상수의 이름을 문자열로 반환한다. name() 메서드와 유사하지만 직접 오버라이딩 가능

        ** 주의 : ordinal()은 가급적 사용하지 않는 것이 좋다
            -> 확장성이 있어 새로운 상수를 추가할 때 숫자가 밀림, 이름으로 사용하는 것을 권장

         */
    }
}
// 모든 열거형은 java.lang.Enum 클래스를 자동으로 상속받는다.
// 따라서 해당 클래스가 제공하는 기능들을 사용할 수 있다
