package lang.immutable.address;

public class ImmutableAddress {

    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
/*
내부 값이 변경되면 안 됨 - value의 필드 final로 선언
값 변경 가능한 setValue() 제거
이 클래스는 생성자 통해서만 값 설정 가능하고 이후 값 변경 불가능

불변 클래스 만드는 방법은 아주 단순
어떻게든 필드 값 변경할 수 없게 클래스 설계

 */
