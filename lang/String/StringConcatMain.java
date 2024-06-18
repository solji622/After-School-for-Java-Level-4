package lang.String;

public class StringConcatMain {
    public static void main(String[] args) {

        String a = "hello";
        String b = " java";

        String result1 = a.concat(b); // 문자열 합치기
        String result2 = a + b; // concat과 동일, 실행 시 concat으로 변환되며 실행


        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
