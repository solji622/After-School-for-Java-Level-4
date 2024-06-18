package lang.String;

public class StringSearchMain {
    // 문자열 검색
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java World.";

        System.out.println("문자열에 'java'가 포함되어 있는지: " + str.contains("Java"));
        System.out.println("'Java'의 첫번째 인덱스: " + str.indexOf("Java"));
        System.out.println("인덱스 10부터 'Java'의 인덱스: " + str.indexOf("Java", 10));
        // 파라미터에 어떤 숫자에 들어가냐에 따라 인덱스 반환값이 달라짐
        System.out.println("'Java'의 마지막 인덱스: " + str.lastIndexOf("Java"));
    }
}
