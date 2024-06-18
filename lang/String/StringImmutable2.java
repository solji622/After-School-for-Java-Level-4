package lang.String;

public class StringImmutable2 {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = str1.concat(" java");

        System.out.println("str = " + str1);
        System.out.println("st2 = " + str2);
    }
}

/*
String은 불변객체다!
따라서 생성 이후에 절대로 내부의 문자열 값을 변경할 수 없다.
변경이 필요한 경우 기존 값 변경하지 않고 새 객체 만들어서 반환

String이 불변으로 설계된 이유
문자열 풀에 있는 String 인스턴스 값이 중간에 변경되면 같은 문자열을 참고하는 다른 변수 값도 함께 변경된다
-> 사이드 이펙트 발생
 */
