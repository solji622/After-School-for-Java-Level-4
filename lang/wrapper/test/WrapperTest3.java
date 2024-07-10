package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {

        String str = "100";

        // String str을 Integer로 변환해서 출력 : 박싱
        Integer num1 = Integer.valueOf(str);
        System.out.println(num1);

        // Integer를 int로 변환해서 출력 : 오토 언박싱
        int num2 = num1;
        System.out.println(num2);

        // int를 Integer로 변환해서 출력 : 오토 박싱
        Integer num3 = num2;
        System.out.println(num3);

    }
}
