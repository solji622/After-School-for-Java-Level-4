package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {

        String[] array = {"1.5", "2.5", "3.0"};

        // 배열의 입력된 모든 숫자의 합을 구하시오.
        // 숫자는 Double형이 입력될 수 있다

        double sum = 0;
        for (String i : array) {
            double d = Double.parseDouble(i);
            sum += d;
        }

        System.out.println(sum);
    }
}
