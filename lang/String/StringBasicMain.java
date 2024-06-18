package lang.String;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str 1 = " + str1);
        System.out.println("str 2 = " + str2);
    }
}

/*
"" 사용 또는 객체 생성
String은 클래스이다! int, boolean과 같은 기본형이 아닌 참조형
따라서 str1 변수에는 String 인스턴스의 참조값만 들어갈 수 있다
그렇다면 String str1 = "hello"; 문장은 어색해보인다
-> String str1 = new String("hello");

값이 있으면 주소값을 주고 없으면 만들어서 주소값을 줌
 */
