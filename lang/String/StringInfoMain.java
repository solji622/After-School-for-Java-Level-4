package lang.String;

public class StringInfoMain {
    // 문자열 정보 조회
    public static void main(String[] args) {
        String str = "hello, java!";

        System.out.println("문자열 길이: " + str.length());
        System.out.println("문자열이 비어있는지: " + str.isEmpty());
        System.out.println("문자열이 비어있거나 공백인지1: " + str.isBlank()); // java 11 이상 가능
        System.out.println("문자열이 비어있거나 공백인지2: " + " ".isBlank());

        char c = str.charAt(7);
        System.out.println("7번 인덱스의 문자: " + c);
    }

}
